# TweetsApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrDeleteRules**](TweetsApi.md#addOrDeleteRules) | **POST** /2/tweets/search/stream/rules | Add/Delete rules |
| [**createTweet**](TweetsApi.md#createTweet) | **POST** /2/tweets | Creation of a Tweet |
| [**deleteTweetById**](TweetsApi.md#deleteTweetById) | **DELETE** /2/tweets/{id} | Tweet delete by Tweet ID |
| [**findTweetById**](TweetsApi.md#findTweetById) | **GET** /2/tweets/{id} | Tweet lookup by Tweet ID |
| [**findTweetsById**](TweetsApi.md#findTweetsById) | **GET** /2/tweets | Tweet lookup by Tweet IDs |
| [**findTweetsThatQuoteATweet**](TweetsApi.md#findTweetsThatQuoteATweet) | **GET** /2/tweets/{id}/quote_tweets | Retrieve Tweets that quote a Tweet. |
| [**getRules**](TweetsApi.md#getRules) | **GET** /2/tweets/search/stream/rules | Rules lookup |
| [**hideReplyById**](TweetsApi.md#hideReplyById) | **PUT** /2/tweets/{tweet_id}/hidden | Hide replies |
| [**listsIdTweets**](TweetsApi.md#listsIdTweets) | **GET** /2/lists/{id}/tweets | List Tweets timeline by List ID. |
| [**sampleStream**](TweetsApi.md#sampleStream) | **GET** /2/tweets/sample/stream | Sample stream |
| [**searchStream**](TweetsApi.md#searchStream) | **GET** /2/tweets/search/stream | Filtered stream |
| [**spaceBuyers**](TweetsApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of Users who purchased a ticket to the given space |
| [**spaceTweets**](TweetsApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve Tweets from a Space. |
| [**tweetCountsFullArchiveSearch**](TweetsApi.md#tweetCountsFullArchiveSearch) | **GET** /2/tweets/counts/all | Full archive search counts |
| [**tweetCountsRecentSearch**](TweetsApi.md#tweetCountsRecentSearch) | **GET** /2/tweets/counts/recent | Recent search counts |
| [**tweetsFullarchiveSearch**](TweetsApi.md#tweetsFullarchiveSearch) | **GET** /2/tweets/search/all | Full-archive search |
| [**tweetsRecentSearch**](TweetsApi.md#tweetsRecentSearch) | **GET** /2/tweets/search/recent | Recent search |
| [**usersIdLike**](TweetsApi.md#usersIdLike) | **POST** /2/users/{id}/likes | Causes the User (in the path) to like the specified Tweet |
| [**usersIdLikedTweets**](TweetsApi.md#usersIdLikedTweets) | **GET** /2/users/{id}/liked_tweets | Returns Tweet objects liked by the provided User ID |
| [**usersIdMentions**](TweetsApi.md#usersIdMentions) | **GET** /2/users/{id}/mentions | User mention timeline by User ID |
| [**usersIdRetweets**](TweetsApi.md#usersIdRetweets) | **POST** /2/users/{id}/retweets | Causes the User (in the path) to retweet the specified Tweet. |
| [**usersIdTimeline**](TweetsApi.md#usersIdTimeline) | **GET** /2/users/{id}/timelines/reverse_chronological | User home timeline by User ID |
| [**usersIdTweets**](TweetsApi.md#usersIdTweets) | **GET** /2/users/{id}/tweets | User Tweets timeline by User ID |
| [**usersIdUnlike**](TweetsApi.md#usersIdUnlike) | **DELETE** /2/users/{id}/likes/{tweet_id} | Causes the User (in the path) to unlike the specified Tweet |
| [**usersIdUnretweets**](TweetsApi.md#usersIdUnretweets) | **DELETE** /2/users/{id}/retweets/{source_tweet_id} | Causes the User (in the path) to unretweet the specified Tweet |


<a name="addOrDeleteRules"></a>
# **addOrDeleteRules**
> AddOrDeleteRulesResponse addOrDeleteRules(addOrDeleteRulesRequest).dryRun(dryRun).execute();

Add/Delete rules

Add or delete rules from a User&#39;s active rule set. Users can provide unique, optionally tagged rules to add. Users can delete their entire rule set or a subset specified by rule ids or values.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Set the params values
    AddOrDeleteRulesRequest addOrDeleteRulesRequest = new AddOrDeleteRulesRequest(); // AddOrDeleteRulesRequest | 
    Boolean dryRun = true; // Boolean | Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes.
    try {
           AddOrDeleteRulesResponse result = apiInstance.tweets().addOrDeleteRules(addOrDeleteRulesRequest)
            .dryRun(dryRun)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#addOrDeleteRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addOrDeleteRulesRequest** | [**AddOrDeleteRulesRequest**](AddOrDeleteRulesRequest.md)|  | |
| **dryRun** | **Boolean**| Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes. | [optional] |

### Return type

[**AddOrDeleteRulesResponse**](AddOrDeleteRulesResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="createTweet"></a>
# **createTweet**
> TweetCreateResponse createTweet(tweetCreateRequest).execute();

Creation of a Tweet

Causes the User to create a Tweet under the authorized account.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    TweetCreateRequest tweetCreateRequest = new TweetCreateRequest(); // TweetCreateRequest | 
    try {
           TweetCreateResponse result = apiInstance.tweets().createTweet(tweetCreateRequest)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#createTweet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tweetCreateRequest** | [**TweetCreateRequest**](TweetCreateRequest.md)|  | |

### Return type

[**TweetCreateResponse**](TweetCreateResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="deleteTweetById"></a>
# **deleteTweetById**
> TweetDeleteResponse deleteTweetById(id).execute();

Tweet delete by Tweet ID

Delete specified Tweet (in the path) by ID.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    String id = "id_example"; // String | The ID of the Tweet to be deleted.
    try {
           TweetDeleteResponse result = apiInstance.tweets().deleteTweetById(id)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#deleteTweetById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the Tweet to be deleted. | |

### Return type

[**TweetDeleteResponse**](TweetDeleteResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="findTweetById"></a>
# **findTweetById**
> Get2TweetsIdResponse findTweetById(id).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Tweet lookup by Tweet ID

Returns a variety of information about the Tweet specified by the requested ID.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    String id = "id_example"; // String | A single Tweet ID.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
           Get2TweetsIdResponse result = apiInstance.tweets().findTweetById(id)
            .tweetFields(tweetFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .pollFields(pollFields)
            .userFields(userFields)
            .placeFields(placeFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#findTweetById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| A single Tweet ID. | |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2TweetsIdResponse**](Get2TweetsIdResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="findTweetsById"></a>
# **findTweetsById**
> Get2TweetsResponse findTweetsById(ids).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Tweet lookup by Tweet IDs

Returns a variety of information about the Tweet specified by the requested ID.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    List<String> ids = Arrays.asList(); // List<String> | A comma separated list of Tweet IDs. Up to 100 are allowed in a single request.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
           Get2TweetsResponse result = apiInstance.tweets().findTweetsById(ids)
            .tweetFields(tweetFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .pollFields(pollFields)
            .userFields(userFields)
            .placeFields(placeFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#findTweetsById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ids** | [**List&lt;String&gt;**](String.md)| A comma separated list of Tweet IDs. Up to 100 are allowed in a single request. | |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2TweetsResponse**](Get2TweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="findTweetsThatQuoteATweet"></a>
# **findTweetsThatQuoteATweet**
> Get2TweetsIdQuoteTweetsResponse findTweetsThatQuoteATweet(id).maxResults(maxResults).paginationToken(paginationToken).exclude(exclude).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Retrieve Tweets that quote a Tweet.

Returns a variety of information about each Tweet that quotes the Tweet specified by the requested ID.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    String id = "id_example"; // String | A single Tweet ID.
    Integer maxResults = 10; // Integer | The maximum number of results to be returned.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Set<String> exclude = new HashSet<>(Arrays.asList()); // Set<String> | The set of entities to exclude (e.g. 'replies' or 'retweets').
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
           Get2TweetsIdQuoteTweetsResponse result = apiInstance.tweets().findTweetsThatQuoteATweet(id)
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .exclude(exclude)
            .tweetFields(tweetFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .pollFields(pollFields)
            .userFields(userFields)
            .placeFields(placeFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#findTweetsThatQuoteATweet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| A single Tweet ID. | |
| **maxResults** | **Integer**| The maximum number of results to be returned. | [optional] [default to 10] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **exclude** | [**Set&lt;String&gt;**](String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;). | [optional] [enum: replies, retweets] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2TweetsIdQuoteTweetsResponse**](Get2TweetsIdQuoteTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="getRules"></a>
# **getRules**
> RulesLookupResponse getRules().ids(ids).maxResults(maxResults).paginationToken(paginationToken).execute();

Rules lookup

Returns rules from a User&#39;s active rule set. Users can fetch all of their rules or a subset, specified by the provided rule ids.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Set the params values
    List<String> ids = Arrays.asList(); // List<String> | A comma-separated list of Rule IDs.
    Integer maxResults = 1000; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This value is populated by passing the 'next_token' returned in a request to paginate through results.
    try {
           RulesLookupResponse result = apiInstance.tweets().getRules()
            .ids(ids)
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#getRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ids** | [**List&lt;String&gt;**](String.md)| A comma-separated list of Rule IDs. | [optional] |
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 1000] |
| **paginationToken** | **String**| This value is populated by passing the &#39;next_token&#39; returned in a request to paginate through results. | [optional] |

### Return type

[**RulesLookupResponse**](RulesLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="hideReplyById"></a>
# **hideReplyById**
> TweetHideResponse hideReplyById(tweetId).tweetHideRequest(tweetHideRequest).execute();

Hide replies

Hides or unhides a reply to an owned conversation.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    TweetHideRequest tweetHideRequest = new TweetHideRequest(); // TweetHideRequest | 
    String tweetId = "tweetId_example"; // String | The ID of the reply that you want to hide or unhide.
    try {
           TweetHideResponse result = apiInstance.tweets().hideReplyById(tweetId)
            .tweetHideRequest(tweetHideRequest)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#hideReplyById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tweetHideRequest** | [**TweetHideRequest**](TweetHideRequest.md)|  | [optional] |
| **tweetId** | **String**| The ID of the reply that you want to hide or unhide. | |

### Return type

[**TweetHideResponse**](TweetHideResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="listsIdTweets"></a>
# **listsIdTweets**
> Get2ListsIdTweetsResponse listsIdTweets(id).maxResults(maxResults).paginationToken(paginationToken).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

List Tweets timeline by List ID.

Returns a list of Tweets associated with the provided List ID.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    String id = "id_example"; // String | The ID of the List.
    Integer maxResults = 100; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
           Get2ListsIdTweetsResponse result = apiInstance.tweets().listsIdTweets(id)
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .tweetFields(tweetFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .pollFields(pollFields)
            .userFields(userFields)
            .placeFields(placeFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#listsIdTweets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the List. | |
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2ListsIdTweetsResponse**](Get2ListsIdTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="sampleStream"></a>
# **sampleStream**
> StreamingTweetResponse sampleStream().backfillMinutes(backfillMinutes).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Sample stream

Streams a deterministic 1% of public Tweets.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.io.InputStream;
import com.google.common.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Set the params values
    Integer backfillMinutes = 56; // Integer | The number of minutes of backfill requested.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
            InputStream result = apiInstance.tweets().sampleStream()
             .backfillMinutes(backfillMinutes)
             .tweetFields(tweetFields)
             .expansions(expansions)
             .mediaFields(mediaFields)
             .pollFields(pollFields)
             .userFields(userFields)
             .placeFields(placeFields)
                .execute();
            try{
               JSON json = new JSON();
               Type localVarReturnType = new TypeToken<StreamingTweetResponse>(){}.getType();
               BufferedReader reader = new BufferedReader(new InputStreamReader(result));
               String line = reader.readLine();
               while (line != null) {
                 if(line.isEmpty()) {
                   System.out.println("==> Empty line");
                   line = reader.readLine();
                   continue;
                 }
                 Object jsonObject = json.getGson().fromJson(line, localVarReturnType);
                 System.out.println(jsonObject != null ? jsonObject.toString() : "Null object");
                 line = reader.readLine();
               }
            }catch (Exception e) {
              e.printStackTrace();
              System.out.println(e);
            }
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#sampleStream");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **backfillMinutes** | **Integer**| The number of minutes of backfill requested. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**StreamingTweetResponse**](StreamingTweetResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="searchStream"></a>
# **searchStream**
> FilteredStreamingTweetResponse searchStream().backfillMinutes(backfillMinutes).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Filtered stream

Streams Tweets matching the stream&#39;s active rule set.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.io.InputStream;
import com.google.common.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Set the params values
    Integer backfillMinutes = 56; // Integer | The number of minutes of backfill requested.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
            InputStream result = apiInstance.tweets().searchStream()
             .backfillMinutes(backfillMinutes)
             .tweetFields(tweetFields)
             .expansions(expansions)
             .mediaFields(mediaFields)
             .pollFields(pollFields)
             .userFields(userFields)
             .placeFields(placeFields)
                .execute();
            try{
               JSON json = new JSON();
               Type localVarReturnType = new TypeToken<FilteredStreamingTweetResponse>(){}.getType();
               BufferedReader reader = new BufferedReader(new InputStreamReader(result));
               String line = reader.readLine();
               while (line != null) {
                 if(line.isEmpty()) {
                   System.out.println("==> Empty line");
                   line = reader.readLine();
                   continue;
                 }
                 Object jsonObject = json.getGson().fromJson(line, localVarReturnType);
                 System.out.println(jsonObject != null ? jsonObject.toString() : "Null object");
                 line = reader.readLine();
               }
            }catch (Exception e) {
              e.printStackTrace();
              System.out.println(e);
            }
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#searchStream");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **backfillMinutes** | **Integer**| The number of minutes of backfill requested. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**FilteredStreamingTweetResponse**](FilteredStreamingTweetResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="spaceBuyers"></a>
# **spaceBuyers**
> Get2SpacesIdBuyersResponse spaceBuyers(id).paginationToken(paginationToken).maxResults(maxResults).userFields(userFields).expansions(expansions).tweetFields(tweetFields).execute();

Retrieve the list of Users who purchased a ticket to the given space

Retrieves the list of Users who purchased a ticket to the given space

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Set the params values
    String id = "1SLjjRYNejbKM"; // String | The ID of the Space to be retrieved.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Integer maxResults = 100; // Integer | The maximum number of results.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2SpacesIdBuyersResponse result = apiInstance.spaces().spaceBuyers(id)
            .paginationToken(paginationToken)
            .maxResults(maxResults)
            .userFields(userFields)
            .expansions(expansions)
            .tweetFields(tweetFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#spaceBuyers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the Space to be retrieved. | |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2SpacesIdBuyersResponse**](Get2SpacesIdBuyersResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="spaceTweets"></a>
# **spaceTweets**
> Get2SpacesIdTweetsResponse spaceTweets(id).maxResults(maxResults).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Retrieve Tweets from a Space.

Retrieves Tweets shared in the specified Space.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Set the params values
    String id = "1SLjjRYNejbKM"; // String | The ID of the Space to be retrieved.
    Integer maxResults = 100; // Integer | The number of Tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
           Get2SpacesIdTweetsResponse result = apiInstance.spaces().spaceTweets(id)
            .maxResults(maxResults)
            .tweetFields(tweetFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .pollFields(pollFields)
            .userFields(userFields)
            .placeFields(placeFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#spaceTweets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the Space to be retrieved. | |
| **maxResults** | **Integer**| The number of Tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100. | [optional] [default to 100] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2SpacesIdTweetsResponse**](Get2SpacesIdTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="tweetCountsFullArchiveSearch"></a>
# **tweetCountsFullArchiveSearch**
> Get2TweetsCountsAllResponse tweetCountsFullArchiveSearch(query).startTime(startTime).endTime(endTime).sinceId(sinceId).untilId(untilId).nextToken(nextToken).paginationToken(paginationToken).granularity(granularity).searchCountFields(searchCountFields).execute();

Full archive search counts

Returns Tweet Counts that match a search query.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Set the params values
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // String | One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length.
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
    String nextToken = "nextToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String granularity = "minute"; // String | The granularity for the search counts results.
    Set<String> searchCountFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of SearchCount fields to display.
    try {
           Get2TweetsCountsAllResponse result = apiInstance.tweets().tweetCountsFullArchiveSearch(query)
            .startTime(startTime)
            .endTime(endTime)
            .sinceId(sinceId)
            .untilId(untilId)
            .nextToken(nextToken)
            .paginationToken(paginationToken)
            .granularity(granularity)
            .searchCountFields(searchCountFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#tweetCountsFullArchiveSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length. | |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional] |
| **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional] |
| **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional] |
| **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **granularity** | **String**| The granularity for the search counts results. | [optional] [default to hour] [enum: minute, hour, day] |
| **searchCountFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of SearchCount fields to display. | [optional] [enum: end, start, tweet_count] |

### Return type

[**Get2TweetsCountsAllResponse**](Get2TweetsCountsAllResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="tweetCountsRecentSearch"></a>
# **tweetCountsRecentSearch**
> Get2TweetsCountsRecentResponse tweetCountsRecentSearch(query).startTime(startTime).endTime(endTime).sinceId(sinceId).untilId(untilId).nextToken(nextToken).paginationToken(paginationToken).granularity(granularity).searchCountFields(searchCountFields).execute();

Recent search counts

Returns Tweet Counts from the last 7 days that match a search query.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Set the params values
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // String | One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length.
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
    String nextToken = "nextToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String granularity = "minute"; // String | The granularity for the search counts results.
    Set<String> searchCountFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of SearchCount fields to display.
    try {
           Get2TweetsCountsRecentResponse result = apiInstance.tweets().tweetCountsRecentSearch(query)
            .startTime(startTime)
            .endTime(endTime)
            .sinceId(sinceId)
            .untilId(untilId)
            .nextToken(nextToken)
            .paginationToken(paginationToken)
            .granularity(granularity)
            .searchCountFields(searchCountFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#tweetCountsRecentSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length. | |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional] |
| **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional] |
| **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional] |
| **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **granularity** | **String**| The granularity for the search counts results. | [optional] [default to hour] [enum: minute, hour, day] |
| **searchCountFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of SearchCount fields to display. | [optional] [enum: end, start, tweet_count] |

### Return type

[**Get2TweetsCountsRecentResponse**](Get2TweetsCountsRecentResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="tweetsFullarchiveSearch"></a>
# **tweetsFullarchiveSearch**
> Get2TweetsSearchAllResponse tweetsFullarchiveSearch(query).startTime(startTime).endTime(endTime).sinceId(sinceId).untilId(untilId).maxResults(maxResults).nextToken(nextToken).paginationToken(paginationToken).sortOrder(sortOrder).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Full-archive search

Returns Tweets that match a search query.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Set the params values
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // String | One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length.
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
    Integer maxResults = 10; // Integer | The maximum number of search results to be returned by a request.
    String nextToken = "nextToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String sortOrder = "recency"; // String | This order in which to return results.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
           Get2TweetsSearchAllResponse result = apiInstance.tweets().tweetsFullarchiveSearch(query)
            .startTime(startTime)
            .endTime(endTime)
            .sinceId(sinceId)
            .untilId(untilId)
            .maxResults(maxResults)
            .nextToken(nextToken)
            .paginationToken(paginationToken)
            .sortOrder(sortOrder)
            .tweetFields(tweetFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .pollFields(pollFields)
            .userFields(userFields)
            .placeFields(placeFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#tweetsFullarchiveSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length. | |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional] |
| **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional] |
| **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional] |
| **maxResults** | **Integer**| The maximum number of search results to be returned by a request. | [optional] [default to 10] |
| **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **sortOrder** | **String**| This order in which to return results. | [optional] [enum: recency, relevancy] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2TweetsSearchAllResponse**](Get2TweetsSearchAllResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="tweetsRecentSearch"></a>
# **tweetsRecentSearch**
> Get2TweetsSearchRecentResponse tweetsRecentSearch(query).startTime(startTime).endTime(endTime).sinceId(sinceId).untilId(untilId).maxResults(maxResults).nextToken(nextToken).paginationToken(paginationToken).sortOrder(sortOrder).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Recent search

Returns Tweets from the last 7 days that match a search query.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // String | One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length.
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
    Integer maxResults = 10; // Integer | The maximum number of search results to be returned by a request.
    String nextToken = "nextToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String sortOrder = "recency"; // String | This order in which to return results.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
           Get2TweetsSearchRecentResponse result = apiInstance.tweets().tweetsRecentSearch(query)
            .startTime(startTime)
            .endTime(endTime)
            .sinceId(sinceId)
            .untilId(untilId)
            .maxResults(maxResults)
            .nextToken(nextToken)
            .paginationToken(paginationToken)
            .sortOrder(sortOrder)
            .tweetFields(tweetFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .pollFields(pollFields)
            .userFields(userFields)
            .placeFields(placeFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#tweetsRecentSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length. | |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional] |
| **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional] |
| **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional] |
| **maxResults** | **Integer**| The maximum number of search results to be returned by a request. | [optional] [default to 10] |
| **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional] |
| **sortOrder** | **String**| This order in which to return results. | [optional] [enum: recency, relevancy] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2TweetsSearchRecentResponse**](Get2TweetsSearchRecentResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="usersIdLike"></a>
# **usersIdLike**
> UsersLikesCreateResponse usersIdLike(id).usersLikesCreateRequest(usersLikesCreateRequest).execute();

Causes the User (in the path) to like the specified Tweet

Causes the User (in the path) to like the specified Tweet. The User in the path must match the User context authorizing the request.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    UsersLikesCreateRequest usersLikesCreateRequest = new UsersLikesCreateRequest(); // UsersLikesCreateRequest | 
    String id = "id_example"; // String | The ID of the authenticated source User that is requesting to like the Tweet.
    try {
           UsersLikesCreateResponse result = apiInstance.tweets().usersIdLike(id)
            .usersLikesCreateRequest(usersLikesCreateRequest)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#usersIdLike");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usersLikesCreateRequest** | [**UsersLikesCreateRequest**](UsersLikesCreateRequest.md)|  | [optional] |
| **id** | **String**| The ID of the authenticated source User that is requesting to like the Tweet. | |

### Return type

[**UsersLikesCreateResponse**](UsersLikesCreateResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="usersIdLikedTweets"></a>
# **usersIdLikedTweets**
> Get2UsersIdLikedTweetsResponse usersIdLikedTweets(id).maxResults(maxResults).paginationToken(paginationToken).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

Returns Tweet objects liked by the provided User ID

Returns a list of Tweets liked by the provided User ID

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    String id = "2244994945"; // String | The ID of the User to lookup.
    Integer maxResults = 56; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
           Get2UsersIdLikedTweetsResponse result = apiInstance.tweets().usersIdLikedTweets(id)
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .tweetFields(tweetFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .pollFields(pollFields)
            .userFields(userFields)
            .placeFields(placeFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#usersIdLikedTweets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the User to lookup. | |
| **maxResults** | **Integer**| The maximum number of results. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2UsersIdLikedTweetsResponse**](Get2UsersIdLikedTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="usersIdMentions"></a>
# **usersIdMentions**
> Get2UsersIdMentionsResponse usersIdMentions(id).sinceId(sinceId).untilId(untilId).maxResults(maxResults).paginationToken(paginationToken).startTime(startTime).endTime(endTime).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

User mention timeline by User ID

Returns Tweet objects that mention username associated to the provided User ID

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    String id = "2244994945"; // String | The ID of the User to lookup.
    String sinceId = "sinceId_example"; // String | The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
    String untilId = "1346889436626259968"; // String | The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
    Integer maxResults = 56; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
           Get2UsersIdMentionsResponse result = apiInstance.tweets().usersIdMentions(id)
            .sinceId(sinceId)
            .untilId(untilId)
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .startTime(startTime)
            .endTime(endTime)
            .tweetFields(tweetFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .pollFields(pollFields)
            .userFields(userFields)
            .placeFields(placeFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#usersIdMentions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the User to lookup. | |
| **sinceId** | **String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional] |
| **untilId** | **String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional] |
| **maxResults** | **Integer**| The maximum number of results. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2UsersIdMentionsResponse**](Get2UsersIdMentionsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="usersIdRetweets"></a>
# **usersIdRetweets**
> UsersRetweetsCreateResponse usersIdRetweets(id).usersRetweetsCreateRequest(usersRetweetsCreateRequest).execute();

Causes the User (in the path) to retweet the specified Tweet.

Causes the User (in the path) to retweet the specified Tweet. The User in the path must match the User context authorizing the request.

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    UsersRetweetsCreateRequest usersRetweetsCreateRequest = new UsersRetweetsCreateRequest(); // UsersRetweetsCreateRequest | 
    String id = "id_example"; // String | The ID of the authenticated source User that is requesting to retweet the Tweet.
    try {
           UsersRetweetsCreateResponse result = apiInstance.tweets().usersIdRetweets(id)
            .usersRetweetsCreateRequest(usersRetweetsCreateRequest)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#usersIdRetweets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usersRetweetsCreateRequest** | [**UsersRetweetsCreateRequest**](UsersRetweetsCreateRequest.md)|  | [optional] |
| **id** | **String**| The ID of the authenticated source User that is requesting to retweet the Tweet. | |

### Return type

[**UsersRetweetsCreateResponse**](UsersRetweetsCreateResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="usersIdTimeline"></a>
# **usersIdTimeline**
> Get2UsersIdTimelinesReverseChronologicalResponse usersIdTimeline(id).sinceId(sinceId).untilId(untilId).maxResults(maxResults).paginationToken(paginationToken).exclude(exclude).startTime(startTime).endTime(endTime).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

User home timeline by User ID

Returns Tweet objects that appears in the provided User ID&#39;s home timeline

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    String id = "id_example"; // String | The ID of the authenticated source User to list Reverse Chronological Timeline Tweets of.
    String sinceId = "791775337160081409"; // String | The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
    String untilId = "1346889436626259968"; // String | The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
    Integer maxResults = 56; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    Set<String> exclude = new HashSet<>(Arrays.asList()); // Set<String> | The set of entities to exclude (e.g. 'replies' or 'retweets').
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
           Get2UsersIdTimelinesReverseChronologicalResponse result = apiInstance.tweets().usersIdTimeline(id)
            .sinceId(sinceId)
            .untilId(untilId)
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .exclude(exclude)
            .startTime(startTime)
            .endTime(endTime)
            .tweetFields(tweetFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .pollFields(pollFields)
            .userFields(userFields)
            .placeFields(placeFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#usersIdTimeline");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the authenticated source User to list Reverse Chronological Timeline Tweets of. | |
| **sinceId** | **String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional] |
| **untilId** | **String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional] |
| **maxResults** | **Integer**| The maximum number of results. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **exclude** | [**Set&lt;String&gt;**](String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;). | [optional] [enum: replies, retweets] |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2UsersIdTimelinesReverseChronologicalResponse**](Get2UsersIdTimelinesReverseChronologicalResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="usersIdTweets"></a>
# **usersIdTweets**
> Get2UsersIdTweetsResponse usersIdTweets(id).sinceId(sinceId).untilId(untilId).maxResults(maxResults).paginationToken(paginationToken).exclude(exclude).startTime(startTime).endTime(endTime).tweetFields(tweetFields).expansions(expansions).mediaFields(mediaFields).pollFields(pollFields).userFields(userFields).placeFields(placeFields).execute();

User Tweets timeline by User ID

Returns a list of Tweets authored by the provided User ID

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);

    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    String id = "2244994945"; // String | The ID of the User to lookup.
    String sinceId = "791775337160081409"; // String | The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
    String untilId = "1346889436626259968"; // String | The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
    Integer maxResults = 56; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    Set<String> exclude = new HashSet<>(Arrays.asList()); // Set<String> | The set of entities to exclude (e.g. 'replies' or 'retweets').
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    try {
           Get2UsersIdTweetsResponse result = apiInstance.tweets().usersIdTweets(id)
            .sinceId(sinceId)
            .untilId(untilId)
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .exclude(exclude)
            .startTime(startTime)
            .endTime(endTime)
            .tweetFields(tweetFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .pollFields(pollFields)
            .userFields(userFields)
            .placeFields(placeFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#usersIdTweets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the User to lookup. | |
| **sinceId** | **String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional] |
| **untilId** | **String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional] |
| **maxResults** | **Integer**| The maximum number of results. | [optional] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **exclude** | [**Set&lt;String&gt;**](String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;). | [optional] [enum: replies, retweets] |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2UsersIdTweetsResponse**](Get2UsersIdTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="usersIdUnlike"></a>
# **usersIdUnlike**
> UsersLikesDeleteResponse usersIdUnlike(id, tweetId).execute();

Causes the User (in the path) to unlike the specified Tweet

Causes the User (in the path) to unlike the specified Tweet. The User must match the User context authorizing the request

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    String id = "id_example"; // String | The ID of the authenticated source User that is requesting to unlike the Tweet.
    String tweetId = "tweetId_example"; // String | The ID of the Tweet that the User is requesting to unlike.
    try {
           UsersLikesDeleteResponse result = apiInstance.tweets().usersIdUnlike(id, tweetId)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#usersIdUnlike");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the authenticated source User that is requesting to unlike the Tweet. | |
| **tweetId** | **String**| The ID of the Tweet that the User is requesting to unlike. | |

### Return type

[**UsersLikesDeleteResponse**](UsersLikesDeleteResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="usersIdUnretweets"></a>
# **usersIdUnretweets**
> UsersRetweetsDeleteResponse usersIdUnretweets(id, sourceTweetId).execute();

Causes the User (in the path) to unretweet the specified Tweet

Causes the User (in the path) to unretweet the specified Tweet. The User must match the User context authorizing the request

### Example
```java
// Import classes:
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.model.*;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.TwitterCredentialsBearer;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterApi apiInstance = new TwitterApi();
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    // apiInstance.setTwitterCredentials(credentials);


    // Set the params values
    String id = "id_example"; // String | The ID of the authenticated source User that is requesting to retweet the Tweet.
    String sourceTweetId = "sourceTweetId_example"; // String | The ID of the Tweet that the User is requesting to unretweet.
    try {
           UsersRetweetsDeleteResponse result = apiInstance.tweets().usersIdUnretweets(id, sourceTweetId)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TweetsApi#usersIdUnretweets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the authenticated source User that is requesting to retweet the Tweet. | |
| **sourceTweetId** | **String**| The ID of the Tweet that the User is requesting to unretweet. | |

### Return type

[**UsersRetweetsDeleteResponse**](UsersRetweetsDeleteResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

