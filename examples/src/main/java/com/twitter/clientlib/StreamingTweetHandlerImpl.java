package com.twitter.clientlib;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

import com.twitter.clientlib.api.TwitterApi;
import com.twitter.clientlib.model.StreamingTweetResponse;

public class StreamingTweetHandlerImpl extends StreamingTweetHandler {
  public StreamingTweetHandlerImpl(TwitterApi apiInstance) {
    super(apiInstance);
  }

  @Override
  public InputStream connectStream() throws ApiException {
    Set<String> tweetFields = new HashSet<>();
    tweetFields.add("author_id");
    tweetFields.add("id");
    tweetFields.add("created_at");
    tweetFields.add("geo");
    Set<String> expansions = new HashSet<>();
    expansions.add("geo.place_id");
    Set<String> placeFields = new HashSet<>();
    placeFields.add("geo");
    placeFields.add("id");
    placeFields.add("name");
    placeFields.add("place_type");

    return this.apiInstance.tweets().sampleStream()
        .backfillMinutes(0)
        .tweetFields(tweetFields).expansions(expansions).placeFields(placeFields)
        .execute();
  }

  @Override
  public void actionOnStreamingObject(StreamingTweetResponse streamingTweet) throws ApiException {
    if(streamingTweet == null) {
      System.err.println("Error: actionOnTweetsStream - streamingTweet is null ");
      return;
    }

    if(streamingTweet.getErrors() != null) {
      streamingTweet.getErrors().forEach(System.out::println);
    } else if (streamingTweet.getData() != null) {
      System.out.println("New streaming tweet: " + streamingTweet.getData().getText());
    }
  }

}
