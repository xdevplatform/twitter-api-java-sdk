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

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.stream;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.twitter.clientlib.exceptions.EmptyStreamTimeoutException;
import com.twitter.clientlib.model.StreamingTweet;
import okio.BufferedSource;

public class TweetsStreamExecutor {

  private static final long EMPTY_STREAM_TIMEOUT = 20000;
  private static final int POLL_WAIT = 5;
  private volatile BlockingQueue<String> rawTweets;
  private volatile BlockingQueue<StreamingTweet> tweets;
  private volatile boolean isRunning = true;

  private long startTime;
  private int tweetsCount = 0;
  private final int tweetsLimit = 250000;
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
      System.out.println("Error: stream is null.");
      return;
    }
    startTime = System.currentTimeMillis();

    rawTweetsQueuerService = Executors.newSingleThreadExecutor();
    rawTweetsQueuerService.submit(new RawTweetsQueuer());

    deserializationService = Executors.newSingleThreadExecutor();
    deserializationService.submit(new DeserializeTweetsTask());

    listenersService = Executors.newSingleThreadExecutor();
    listenersService.submit(new TweetsListenersTask());
  }

  public synchronized void shutdown() {
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
    System.out.println("TweetsStreamListenersExecutor is shutting down.");
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
        System.err.println("Pool did not terminate");
    }
  }

  private class RawTweetsQueuer implements Runnable {

    @Override
    public void run() {
      queueTweets();
    }

    public void queueTweets() {
      String line = null;
      try {
        boolean emptyResponse = false;
        long firstEmptyResponseMillis = 0;
        long lastEmptyReponseMillis;
        while (isRunning) {
          line = stream.readUtf8Line();
          if(line == null || line.isEmpty()) {
            if(!emptyResponse) {
              firstEmptyResponseMillis = System.currentTimeMillis();
              emptyResponse = true;
            } else {
              lastEmptyReponseMillis = System.currentTimeMillis();
              if(lastEmptyReponseMillis - firstEmptyResponseMillis > EMPTY_STREAM_TIMEOUT) {
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
        System.out.println("Something went wrong. Closing stream... " + e.getMessage());
        shutdown();
      }
    }
  }

  private class DeserializeTweetsTask implements Runnable {
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
          StreamingTweet tweet = objectMapper.readValue(rawTweet, StreamingTweet.class);
          tweets.put(tweet);
        } catch (InterruptedException e) {

        } catch (JsonProcessingException e) {
          System.out.println("debug log here");
        }
      }
    }
  }

  private class TweetsListenersTask implements Runnable {
    @Override
    public void run() {
      processTweets();
    }

    private void processTweets() {
      StreamingTweet streamingTweet;

        while (isRunning) {
          try {
            streamingTweet = tweets.poll(POLL_WAIT, TimeUnit.MILLISECONDS);
            if(streamingTweet == null) continue;
            for (TweetsStreamListener listener : listeners) {
              listener.onTweetArrival(streamingTweet);
            }
            tweetsCount++;
            if(tweetsCount == tweetsLimit) {
              long stopTime = System.currentTimeMillis();
              long durationInMillis = stopTime - startTime;
              double seconds = durationInMillis / 1000.0;
              System.out.println("Total duration in seconds: " + seconds);
              shutdown();
            }
          } catch (InterruptedException e) {

          }

        }

    }
  }
}
