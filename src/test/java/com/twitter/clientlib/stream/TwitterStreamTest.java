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

import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.integration.ApiTester;
import com.twitter.clientlib.model.StreamingTweetResponse;
import com.twitter.clientlib.query.StreamQueryParameters;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
class TwitterStreamTest extends ApiTester {

    private static TwitterStream twitterStream;

    private  TweetsStreamListener courier;
    private List<StreamingTweetResponse> tweets;

    @BeforeAll
    public static void beforeAll() {
        twitterStream = new TwitterStream();
        twitterStream.setTwitterCredentials(new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN")));
        twitterStream.setRetries(4);
    }

    @BeforeEach
    public void setUp() {
        tweets = new LinkedList<>();
        courier = new TweetCourier(tweets);
        twitterStream.addListener(courier);
    }

    @AfterEach
    public void tearDown() {
        twitterStream.removeListener(courier);
        twitterStream.shutdown();
    }

    @Test
    public void shutdown() throws InterruptedException {
        twitterStream.sampleStream(new StreamQueryParameters.Builder().build());
        TimeUnit.SECONDS.sleep(5);
        assertTrue(tweets.size() > 1);
        twitterStream.shutdown();
    }

    @Test
    public void sampleStream() throws InterruptedException {
        twitterStream.sampleStream(new StreamQueryParameters.Builder().build());
        TimeUnit.SECONDS.sleep(5);
        assertTrue(tweets.size() > 1);
    }

    @Test
    public void sampleStreamAddSecondListener() throws InterruptedException {
        List<StreamingTweetResponse> tweetsDuplicate = new LinkedList<>();
        TweetsStreamListener courierDuplicate = new TweetCourier(tweetsDuplicate);
        twitterStream.addListener(courierDuplicate);
        twitterStream.sampleStream(new StreamQueryParameters.Builder().build());
        TimeUnit.SECONDS.sleep(5);
        assertTrue(tweets.size() > 1);
        assertTrue(tweetsDuplicate.size() > 1);
        assertEquals(tweets.size(), tweetsDuplicate.size());
    }

    @Test
    public void sampleStreamAddSecondListenerAndRemove() throws InterruptedException {
        List<StreamingTweetResponse> tweetsDuplicate = new LinkedList<>();
        TweetsStreamListener courierDuplicate = new TweetCourier(tweetsDuplicate);
        twitterStream.addListener(courierDuplicate);
        twitterStream.removeListener(courierDuplicate);
        twitterStream.sampleStream(new StreamQueryParameters.Builder().build());
        TimeUnit.SECONDS.sleep(5);
        assertTrue(tweets.size() > 1);
        assertEquals(0, tweetsDuplicate.size());
    }

    private class TweetCourier implements TweetsStreamListener {

        private List<StreamingTweetResponse> tweetsList;

        private TweetCourier(List<StreamingTweetResponse> tweetsList) {
            this.tweetsList = tweetsList;
        }
        @Override
        public void onTweetArrival(StreamingTweetResponse tweet) {
            tweetsList.add(tweet);
        }
    }
}