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

import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TweetsApi;
import com.twitter.clientlib.exceptions.AuthenticationException;
import com.twitter.clientlib.exceptions.StreamException;
import com.twitter.clientlib.exceptions.TooManyRequestsException;
import com.twitter.clientlib.query.StreamQueryParameters;

import okio.BufferedSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PreDestroy;
import java.util.LinkedList;
import java.util.List;

public class TwitterStream {

    private static final Logger logger = LoggerFactory.getLogger(TwitterStream.class);
    private final TweetsApi tweets = new TweetsApi();

    private final ApiClient apiClient = new ApiClient();

    private final List<TweetsStreamListener> listeners = new LinkedList<>();

    private TweetsStreamExecutor executor;

    private int retries;

    public TwitterStream() {
        init();
    }

    public TwitterStream(int retries) {
        this.retries = retries;
        init();
    }

    private void init() {
        initBasePath();
        tweets.setClient(apiClient);
    }

    public void setTwitterCredentials(TwitterCredentialsBearer credentials) {
        apiClient.setTwitterCredentials(credentials);
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    public void addListener(TweetsStreamListener listener) {
        listeners.add(listener);
    }

    public void removeListener(TweetsStreamListener listener) {
        listeners.remove(listener);
    }

    public void sampleStream(StreamQueryParameters streamParameters) {
        try {
            BufferedSource streamResult = tweets.sampleStream().parameters(streamParameters).execute(retries == 0 ? 1 : retries);
            executor = new TweetsStreamExecutor(streamResult);
            listeners.forEach(executor::addListener);
            executor.start();
        } catch (ApiException e) {
            if(e.getCode() == 401) {
                logger.error("Authentication didn't work");
                throw new AuthenticationException("Not authenticated. Please check the credentials", e);
            }
            if(e.getCode() == 429){
                /* for this error twitter indicates that to implement a reconnection mechanism
                *  see: https://developer.twitter.com/en/docs/twitter-api/tweets/volume-streams/integrate/handling-disconnections
                */
                throw new TooManyRequestsException("Too many requests. Service responded with 429 status code. Consider setting 'retries' or increasing its value");
            }
            throw new StreamException("An exception occurred during stream execution ",e);
        }
    }

    public void shutdown() {
        executor.shutdown();
    }

    @PreDestroy
    public void preDestroy() {
        executor.shutdown();
    }

    private void initBasePath() {
        String basePath = System.getenv("TWITTER_API_BASE_PATH");
        apiClient.setBasePath(basePath != null ? basePath : "https://api.twitter.com");
    }

}
