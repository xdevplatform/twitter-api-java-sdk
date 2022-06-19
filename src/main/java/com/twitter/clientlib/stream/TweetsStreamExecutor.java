/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/


package com.twitter.clientlib.stream;


import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.twitter.clientlib.exceptions.EmptyStreamTimeoutException;
import com.twitter.clientlib.model.StreamingTweetResponse;
import okio.BufferedSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TweetsStreamExecutor {

  private static final Logger logger = LoggerFactory.getLogger(TweetsStreamExecutor.class);

  private static final long EMPTY_STREAM_TIMEOUT = 20;
  private static final int POLL_WAIT = 5;

  private volatile BlockingQueue<String> rawTweets;
  private volatile BlockingQueue<StreamingTweetResponse> tweets;
  private volatile boolean isRunning = true;
  private ExecutorService rawTweetsQueuerService;
  private ExecutorService deserializationService;
  private ExecutorService listenersService;
  private final List<TweetsStreamListener> listeners = new ArrayList<>();
  private BufferedSource stream;

  public TweetsStreamExecutor(BufferedSource stream) {
    this.rawTweets = new LinkedBlockingDeque<>();
    this.tweets = new LinkedBlockingDeque<>();
    this.stream = stream;
  }

  public void addListener(TweetsStreamListener toAdd) {
    listeners.add(toAdd);
  }

  public void removeListener(TweetsStreamListener toRemove) {
    listeners.remove(toRemove);
  }

  public void start() {
    if (stream == null) {
      logger.error("Stream is null. Exiting...");
      return;
    }

    rawTweetsQueuerService = Executors.newSingleThreadExecutor();
    rawTweetsQueuerService.submit(new RawTweetsQueuer());

    deserializationService = Executors.newSingleThreadExecutor();
    deserializationService.submit(new DeserializeTweetsTask());

    listenersService = Executors.newSingleThreadExecutor();
    listenersService.submit(new TweetsListenersTask());
  }

  public synchronized void shutdown() {
    logger.info("TweetsStreamListenersExecutor is shutting down.");
    isRunning = false;
    shutDownServices();
    try {
      terminateServices();
      stream.close();
    } catch (InterruptedException ie) {
      shutDownServices();
      Thread.currentThread().interrupt();
    } catch (IOException e) {

    }
  }

  private void shutDownServices() {
    rawTweetsQueuerService.shutdown();
    deserializationService.shutdown();
    listenersService.shutdown();
  }

  private void terminateServices() throws InterruptedException {
    terminateService(rawTweetsQueuerService);
    terminateService(deserializationService);
    terminateService(listenersService);
  }
  private void terminateService(ExecutorService executorService) throws InterruptedException {
    if (!executorService.awaitTermination(1500, TimeUnit.MILLISECONDS)) {
      executorService.shutdownNow();
      if (!executorService.awaitTermination(1500, TimeUnit.MILLISECONDS))
        logger.error("Thread pool did not terminate");
    }
  }

  private class RawTweetsQueuer implements Runnable {

    private final Logger logger = LoggerFactory.getLogger(RawTweetsQueuer.class);

    @Override
    public void run() {
      queueTweets();
    }

    public void queueTweets() {
      String line = null;
      try {
        boolean emptyResponse = false;
        LocalDateTime firstEmpty = LocalDateTime.now();
        while (isRunning) {
          line = stream.readUtf8Line();
          if(line == null || line.isEmpty()) {
            if(!emptyResponse) {
              firstEmpty = LocalDateTime.now();
              emptyResponse = true;
            } else {
              if(LocalDateTime.now().minus(EMPTY_STREAM_TIMEOUT, ChronoUnit.SECONDS).isAfter(firstEmpty)) {
                throw new EmptyStreamTimeoutException(String.format("Stream was empty for %d seconds consecutively", EMPTY_STREAM_TIMEOUT));
              } 
            }
            continue;
          }
          emptyResponse = false;
          try {
            rawTweets.put(line);
          } catch (Exception ignore) {

          }
        }
      } catch (Exception e) {
        logger.error("Something went wrong. Closing stream... {}", e.getMessage());
        shutdown();
      }
    }
  }

  private class DeserializeTweetsTask implements Runnable {

    private final Logger logger = LoggerFactory.getLogger(DeserializeTweetsTask.class);
    private final ObjectMapper objectMapper;

    private DeserializeTweetsTask() {
      this.objectMapper = new ObjectMapper();
      objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Override
    public void run() {
      while (isRunning) {
        try {
          String rawTweet = rawTweets.poll(POLL_WAIT, TimeUnit.MILLISECONDS);
          if (rawTweet == null) continue;
          StreamingTweetResponse tweet = objectMapper.readValue(rawTweet, StreamingTweetResponse.class);
          tweets.put(tweet);
        } catch (InterruptedException ignore) {

        } catch (JsonProcessingException e) {
          logger.debug("Json could not be parsed");
        }
      }
    }
  }

  private class TweetsListenersTask implements Runnable {

    private final Logger logger = LoggerFactory.getLogger(TweetsListenersTask.class);
    @Override
    public void run() {
      processTweets();
    }

    private void processTweets() {
      StreamingTweetResponse streamingTweet;

        while (isRunning) {
          try {
            streamingTweet = tweets.poll(POLL_WAIT, TimeUnit.MILLISECONDS);
            if(streamingTweet == null) continue;
            for (TweetsStreamListener listener : listeners) {
              listener.onTweetArrival(streamingTweet);
            }
          } catch (InterruptedException e) {

          }

        }

    }
  }
}

