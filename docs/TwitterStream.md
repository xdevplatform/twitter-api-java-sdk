# TwitterStream

A wrapper for calling the stream endpoints reading the BufferedSource and producing deserialized responses from every line of the BufferedSource.


<a name="sampleStream"></a>
# **sampleStream**
 
```java 
twitterStream.addListener(new TweetListener());
twitterStream.startSampleStream(new StreamQueryParameters.Builder().build());
```

The listener must implement this method 
```java
void onTweetArrival(StreamingTweetResponse streamingTweet);
```

### Example

```java
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.query.StreamQueryParameters;
import com.twitter.clientlib.query.model.TweetField;
import com.twitter.clientlib.stream.TweetsStreamListener;
import com.twitter.clientlib.stream.TwitterStream;


public class HelloWorldStreaming {

    public static void main(String[] args) {
        /**
         * Set the credentials for the required APIs.
         * The Java SDK supports TwitterCredentialsOAuth2 & TwitterCredentialsBearer.
         * Check the 'security' tag of the required APIs in https://api.twitter.com/2/openapi.json in order
         * to use the right credential object.
         */
        TwitterStream twitterStream = new TwitterStream(new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN")));
        twitterStream.addListener(new Responder());

        twitterStream.startSampleStream(new StreamQueryParameters.Builder()
                .withTweetFields(TweetField.AUTHOR_ID, TweetField.ID, TweetField.CREATED_AT)
                .build());

    }
}

class Responder implements TweetsStreamListener {
    @Override
    public void onTweetArrival(StreamingTweetResponse streamingTweet) {
        if (streamingTweet == null) {
            System.err.println("Error: actionOnTweetsStream - streamingTweet is null ");
            return;
        }

        if (streamingTweet.getErrors() != null) {
            streamingTweet.getErrors().forEach(System.out::println);
        } else if (streamingTweet.getData() != null) {
            System.out.println("New streaming tweet: " + streamingTweet.getData().getText());
        }
    }
}
```
