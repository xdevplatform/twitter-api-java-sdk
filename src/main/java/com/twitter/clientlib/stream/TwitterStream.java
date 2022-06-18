package com.twitter.clientlib.stream;

import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TweetsApi;
import com.twitter.clientlib.exceptions.AuthenticationException;
import com.twitter.clientlib.exceptions.StreamException;
import com.twitter.clientlib.query.StreamQueryParameters;

import okio.BufferedSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class TwitterStream {

    private static final Logger logger = LoggerFactory.getLogger(TwitterStream.class);
    private final TweetsApi tweets = new TweetsApi();

    private final ApiClient apiClient = new ApiClient();

    private final List<TweetsStreamListener> listeners = new LinkedList<>();

    private TweetsStreamExecutor executor;

    public TwitterStream() {
        initBasePath();
        tweets.setClient(apiClient);
    }

    public void setTwitterCredentials(TwitterCredentialsBearer credentials) {
        apiClient.setTwitterCredentials(credentials);
    }

    public void addListener(TweetsStreamListener listener) {
        listeners.add(listener);
    }

    public void sampleStream(StreamQueryParameters streamParameters) {
        try {
            BufferedSource streamResult = tweets.sampleStream(streamParameters);
            executor = new TweetsStreamExecutor(streamResult);
            listeners.forEach(executor::addListener);
            executor.start();
        } catch (ApiException e) {
            if(e.getCode() == 401) {
                logger.error("Authentication didn't work");
                throw new AuthenticationException("Not authenticated. Please check the credentials", e);
            }
            throw new StreamException("An exception occurred during stream execution", e);
        }
    }

    public void shutdown() {
        executor.shutdown();
    }

    private void initBasePath() {
        String basePath = System.getenv("TWITTER_API_BASE_PATH");
        apiClient.setBasePath(basePath != null ? basePath : "https://api.twitter.com");
    }

}
