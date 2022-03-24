# TweetsApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrDeleteRules**](TweetsApi.md#addOrDeleteRules) | **POST** /2/tweets/search/stream/rules | Add/Delete rules
[**createTweet**](TweetsApi.md#createTweet) | **POST** /2/tweets | Creation of a Tweet
[**deleteTweetById**](TweetsApi.md#deleteTweetById) | **DELETE** /2/tweets/{id} | Tweet delete by Tweet ID
[**findTweetById**](TweetsApi.md#findTweetById) | **GET** /2/tweets/{id} | Tweet lookup by Tweet ID
[**findTweetsById**](TweetsApi.md#findTweetsById) | **GET** /2/tweets | Tweet lookup by Tweet IDs
[**findTweetsThatQuoteATweet**](TweetsApi.md#findTweetsThatQuoteATweet) | **GET** /2/tweets/{id}/quote_tweets | Retrieve tweets that quote a tweet.
[**getRules**](TweetsApi.md#getRules) | **GET** /2/tweets/search/stream/rules | Rules lookup
[**hideReplyById**](TweetsApi.md#hideReplyById) | **PUT** /2/tweets/{id}/hidden | Hide replies
[**listsIdTweets**](TweetsApi.md#listsIdTweets) | **GET** /2/lists/{id}/tweets | List Tweets timeline by List ID
[**sampleStream**](TweetsApi.md#sampleStream) | **GET** /2/tweets/sample/stream | Sample stream
[**searchStream**](TweetsApi.md#searchStream) | **GET** /2/tweets/search/stream | Filtered stream
[**spaceBuyers**](TweetsApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of users who purchased a ticket to the given space
[**spaceTweets**](TweetsApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve tweets from a Space
[**tweetCountsFullArchiveSearch**](TweetsApi.md#tweetCountsFullArchiveSearch) | **GET** /2/tweets/counts/all | Full archive search counts
[**tweetCountsRecentSearch**](TweetsApi.md#tweetCountsRecentSearch) | **GET** /2/tweets/counts/recent | Recent search counts
[**tweetsFullarchiveSearch**](TweetsApi.md#tweetsFullarchiveSearch) | **GET** /2/tweets/search/all | Full-archive search
[**tweetsRecentSearch**](TweetsApi.md#tweetsRecentSearch) | **GET** /2/tweets/search/recent | Recent search
[**usersIdLike**](TweetsApi.md#usersIdLike) | **POST** /2/users/{id}/likes | Causes the user (in the path) to like the specified tweet
[**usersIdLikedTweets**](TweetsApi.md#usersIdLikedTweets) | **GET** /2/users/{id}/liked_tweets | Returns Tweet objects liked by the provided User ID
[**usersIdMentions**](TweetsApi.md#usersIdMentions) | **GET** /2/users/{id}/mentions | User mention timeline by User ID
[**usersIdRetweets**](TweetsApi.md#usersIdRetweets) | **POST** /2/users/{id}/retweets | Causes the user (in the path) to retweet the specified tweet
[**usersIdTweets**](TweetsApi.md#usersIdTweets) | **GET** /2/users/{id}/tweets | User Tweets timeline by User ID
[**usersIdUnlike**](TweetsApi.md#usersIdUnlike) | **DELETE** /2/users/{id}/likes/{tweet_id} | Causes the user (in the path) to unlike the specified tweet
[**usersIdUnretweets**](TweetsApi.md#usersIdUnretweets) | **DELETE** /2/users/{id}/retweets/{source_tweet_id} | Causes the user (in the path) to unretweet the specified tweet


<a name="addOrDeleteRules"></a>
# **addOrDeleteRules**
> AddOrDeleteRulesResponse addOrDeleteRules(addOrDeleteRulesRequestdryRun)

Add/Delete rules

Add or delete rules from a user&#39;s active rule set. Users can provide unique, optionally tagged rules to add. Users can delete their entire rule set or a subset specified by rule ids or values.

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    AddOrDeleteRulesRequest addOrDeleteRulesRequest = new AddOrDeleteRulesRequest(); // AddOrDeleteRulesRequest | 
    Boolean dryRun = true; // Boolean | Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes.
    try {
           AddOrDeleteRulesResponse result = apiInstance.tweets().addOrDeleteRules(addOrDeleteRulesRequest, dryRun);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addOrDeleteRulesRequest** | [**AddOrDeleteRulesRequest**](AddOrDeleteRulesRequest.md)|  |
 **dryRun** | **Boolean**| Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes. | [optional]

### Return type

[**AddOrDeleteRulesResponse**](AddOrDeleteRulesResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="createTweet"></a>
# **createTweet**
> TweetCreateResponse createTweet(createTweetRequest)

Creation of a Tweet

Causes the user to create a tweet under the authorized account.

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    CreateTweetRequest createTweetRequest = new CreateTweetRequest(); // CreateTweetRequest | 
    try {
           TweetCreateResponse result = apiInstance.tweets().createTweet(createTweetRequest);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createTweetRequest** | [**CreateTweetRequest**](CreateTweetRequest.md)|  | [optional]

### Return type

[**TweetCreateResponse**](TweetCreateResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="deleteTweetById"></a>
# **deleteTweetById**
> TweetDeleteResponse deleteTweetById(id)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String id = "id_example"; // String | The ID of the Tweet to be deleted.
    try {
           TweetDeleteResponse result = apiInstance.tweets().deleteTweetById(id);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Tweet to be deleted. |

### Return type

[**TweetDeleteResponse**](TweetDeleteResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="findTweetById"></a>
# **findTweetById**
> SingleTweetLookupResponse findTweetById(idexpansionstweetFieldsuserFieldsmediaFieldsplaceFieldspollFields)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String id = "id_example"; // String | A single Tweet ID.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    try {
           SingleTweetLookupResponse result = apiInstance.tweets().findTweetById(id, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| A single Tweet ID. |
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**SingleTweetLookupResponse**](SingleTweetLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="findTweetsById"></a>
# **findTweetsById**
> MultiTweetLookupResponse findTweetsById(idsexpansionstweetFieldsuserFieldsmediaFieldsplaceFieldspollFields)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    List<String> ids = Arrays.asList(); // List<String> | A comma separated list of Tweet IDs. Up to 100 are allowed in a single request.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    try {
           MultiTweetLookupResponse result = apiInstance.tweets().findTweetsById(ids, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;String&gt;**](String.md)| A comma separated list of Tweet IDs. Up to 100 are allowed in a single request. |
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**MultiTweetLookupResponse**](MultiTweetLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="findTweetsThatQuoteATweet"></a>
# **findTweetsThatQuoteATweet**
> QuoteTweetLookupResponse findTweetsThatQuoteATweet(idmaxResultsexpansionstweetFieldsuserFieldsmediaFieldsplaceFieldspollFields)

Retrieve tweets that quote a tweet.

Returns a variety of information about each tweet that quotes the Tweet specified by the requested ID.

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String id = "id_example"; // String | The ID of the Quoted Tweet.
    Integer maxResults = 10; // Integer | The maximum number of results to be returned.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    try {
           QuoteTweetLookupResponse result = apiInstance.tweets().findTweetsThatQuoteATweet(id, maxResults, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Quoted Tweet. |
 **maxResults** | **Integer**| The maximum number of results to be returned. | [optional] [default to 10]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**QuoteTweetLookupResponse**](QuoteTweetLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="getRules"></a>
# **getRules**
> GetRulesResponse getRules(idsmaxResultspaginationToken)

Rules lookup

Returns rules from a user&#39;s active rule set. Users can fetch all of their rules or a subset, specified by the provided rule ids.

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    List<String> ids = Arrays.asList(); // List<String> | A comma-separated list of Rule IDs.
    Integer maxResults = 1000; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This value is populated by passing the 'next_token' returned in a request to paginate through results.
    try {
           GetRulesResponse result = apiInstance.tweets().getRules(ids, maxResults, paginationToken);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**List&lt;String&gt;**](String.md)| A comma-separated list of Rule IDs. | [optional]
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 1000]
 **paginationToken** | **String**| This value is populated by passing the &#39;next_token&#39; returned in a request to paginate through results. | [optional]

### Return type

[**GetRulesResponse**](GetRulesResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="hideReplyById"></a>
# **hideReplyById**
> HideReplyByIdResponse hideReplyById(hideReplyByIdRequestid)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    HideReplyByIdRequest hideReplyByIdRequest = new HideReplyByIdRequest(); // HideReplyByIdRequest | 
    String id = "id_example"; // String | The ID of the reply that you want to hide or unhide.
    try {
           HideReplyByIdResponse result = apiInstance.tweets().hideReplyById(hideReplyByIdRequest, id);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hideReplyByIdRequest** | [**HideReplyByIdRequest**](HideReplyByIdRequest.md)|  | [optional]
 **id** | **String**| The ID of the reply that you want to hide or unhide. |

### Return type

[**HideReplyByIdResponse**](HideReplyByIdResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. The reply has been hidden or unhidden. |  -  |
**0** | The request has failed. |  -  |

<a name="listsIdTweets"></a>
# **listsIdTweets**
> ListsIdTweetsResponse listsIdTweets(idmaxResultspaginationTokenexpansionstweetFieldsuserFieldsmediaFieldsplaceFieldspollFields)

List Tweets timeline by List ID

Returns a list of Tweets associated with the provided List ID

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String id = "id_example"; // String | The ID of the List to list Tweets of
    Integer maxResults = 100; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    try {
           ListsIdTweetsResponse result = apiInstance.tweets().listsIdTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the List to list Tweets of |
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**ListsIdTweetsResponse**](ListsIdTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="sampleStream"></a>
# **sampleStream**
> StreamingTweet sampleStream(expansionstweetFieldsuserFieldsmediaFieldsplaceFieldspollFieldsbackfillMinutes)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
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
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Integer backfillMinutes = 56; // Integer | The number of minutes of backfill requested
    try {
            InputStream result = apiInstance.tweets().sampleStream(expansions, tweetFields, userFields, mediaFields, placeFields, pollFields, backfillMinutes);
            try{
               JSON json = new JSON();
               Type localVarReturnType = new TypeToken<StreamingTweet>(){}.getType();
               BufferedReader reader = new BufferedReader(new InputStreamReader(result));
               String line = reader.readLine();
               while (line != null) {
                 System.out.println(json.getGson().fromJson(line, localVarReturnType).toString());
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]
 **backfillMinutes** | **Integer**| The number of minutes of backfill requested | [optional]

### Return type

[**StreamingTweet**](StreamingTweet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful. Successful responses will return a stream of individual JSON Tweet payloads. |  -  |
**0** | The request has failed. |  -  |

<a name="searchStream"></a>
# **searchStream**
> FilteredStreamingTweet searchStream(expansionstweetFieldsuserFieldsmediaFieldsplaceFieldspollFieldsbackfillMinutes)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
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
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    Integer backfillMinutes = 56; // Integer | The number of minutes of backfill requested
    try {
            InputStream result = apiInstance.tweets().searchStream(expansions, tweetFields, userFields, mediaFields, placeFields, pollFields, backfillMinutes);
            try{
               JSON json = new JSON();
               Type localVarReturnType = new TypeToken<StreamingTweet>(){}.getType();
               BufferedReader reader = new BufferedReader(new InputStreamReader(result));
               String line = reader.readLine();
               while (line != null) {
                 System.out.println(json.getGson().fromJson(line, localVarReturnType).toString());
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]
 **backfillMinutes** | **Integer**| The number of minutes of backfill requested | [optional]

### Return type

[**FilteredStreamingTweet**](FilteredStreamingTweet.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful. Successful responses will return a stream of individual JSON Tweet payloads. |  -  |
**0** | The request has failed. |  -  |

<a name="spaceBuyers"></a>
# **spaceBuyers**
> MultiUserLookupResponse spaceBuyers(iduserFields)

Retrieve the list of users who purchased a ticket to the given space

Retrieves the list of users who purchased a ticket to the given space

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String id = "1YqKDqWqdPLsV"; // String | The space id from which tweets will be retrieved
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    try {
           MultiUserLookupResponse result = apiInstance.spaces().spaceBuyers(id, userFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The space id from which tweets will be retrieved |
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiUserLookupResponse**](MultiUserLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="spaceTweets"></a>
# **spaceTweets**
> MultiTweetLookupResponse spaceTweets(maxResultsidtweetFields)

Retrieve tweets from a Space

Retrieves tweets shared in the specified space

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    Integer maxResults = 56; // Integer | The number of tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100
    String id = "1YqKDqWqdPLsV"; // String | The space id from which tweets will be retrieved
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           MultiTweetLookupResponse result = apiInstance.spaces().spaceTweets(maxResults, id, tweetFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **maxResults** | **Integer**| The number of tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100 | [optional]
 **id** | **String**| The space id from which tweets will be retrieved |
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]

### Return type

[**MultiTweetLookupResponse**](MultiTweetLookupResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="tweetCountsFullArchiveSearch"></a>
# **tweetCountsFullArchiveSearch**
> TweetCountsResponse tweetCountsFullArchiveSearch(querystartTimeendTimesinceIduntilIdnextTokenpaginationTokengranularity)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // String | One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
    String nextToken = "nextToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    Granularity granularity = Granularity.fromValue("minute"); // Granularity | The granularity for the search counts results.
    try {
           TweetCountsResponse result = apiInstance.tweets().tweetCountsFullArchiveSearch(query, startTime, endTime, sinceId, untilId, nextToken, paginationToken, granularity);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length |
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional]
 **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional]
 **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional]
 **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **granularity** | [**Granularity**](.md)| The granularity for the search counts results. | [optional] [default to hour] [enum: minute, hour, day]

### Return type

[**TweetCountsResponse**](TweetCountsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tweet counts response |  -  |
**0** | The request has failed. |  -  |

<a name="tweetCountsRecentSearch"></a>
# **tweetCountsRecentSearch**
> TweetCountsResponse tweetCountsRecentSearch(querystartTimeendTimesinceIduntilIdnextTokenpaginationTokengranularity)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // String | One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
    String nextToken = "nextToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    Granularity granularity = Granularity.fromValue("minute"); // Granularity | The granularity for the search counts results.
    try {
           TweetCountsResponse result = apiInstance.tweets().tweetCountsRecentSearch(query, startTime, endTime, sinceId, untilId, nextToken, paginationToken, granularity);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length |
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional]
 **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional]
 **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional]
 **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **granularity** | [**Granularity**](.md)| The granularity for the search counts results. | [optional] [default to hour] [enum: minute, hour, day]

### Return type

[**TweetCountsResponse**](TweetCountsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Recent tweet counts response |  -  |
**0** | The request has failed. |  -  |

<a name="tweetsFullarchiveSearch"></a>
# **tweetsFullarchiveSearch**
> TweetSearchResponse tweetsFullarchiveSearch(querystartTimeendTimesinceIduntilIdmaxResultssortOrdernextTokenpaginationTokenexpansionstweetFieldsuserFieldsmediaFieldsplaceFieldspollFields)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // String | One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
    Integer maxResults = 10; // Integer | The maximum number of search results to be returned by a request.
    String sortOrder = "recency"; // String | This order in which to return results.
    String nextToken = "nextToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    try {
           TweetSearchResponse result = apiInstance.tweets().tweetsFullarchiveSearch(query, startTime, endTime, sinceId, untilId, maxResults, sortOrder, nextToken, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length |
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional]
 **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional]
 **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional]
 **maxResults** | **Integer**| The maximum number of search results to be returned by a request. | [optional] [default to 10]
 **sortOrder** | **String**| This order in which to return results. | [optional] [enum: recency, relevancy]
 **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**TweetSearchResponse**](TweetSearchResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tweets full archive search response |  -  |
**0** | The request has failed. |  -  |

<a name="tweetsRecentSearch"></a>
# **tweetsRecentSearch**
> TweetSearchResponse tweetsRecentSearch(querystartTimeendTimesinceIduntilIdmaxResultssortOrdernextTokenpaginationTokenexpansionstweetFieldsuserFieldsmediaFieldsplaceFieldspollFields)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String query = "(from:TwitterDev OR from:TwitterAPI) has:media -is:retweet"; // String | One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
    String sinceId = "sinceId_example"; // String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
    String untilId = "untilId_example"; // String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
    Integer maxResults = 10; // Integer | The maximum number of search results to be returned by a request.
    String sortOrder = "recency"; // String | This order in which to return results.
    String nextToken = "nextToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    try {
           TweetSearchResponse result = apiInstance.tweets().tweetsRecentSearch(query, startTime, endTime, sinceId, untilId, maxResults, sortOrder, nextToken, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length |
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional]
 **sinceId** | **String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional]
 **untilId** | **String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional]
 **maxResults** | **Integer**| The maximum number of search results to be returned by a request. | [optional] [default to 10]
 **sortOrder** | **String**| This order in which to return results. | [optional] [enum: recency, relevancy]
 **nextToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**TweetSearchResponse**](TweetSearchResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tweets recent search response |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdLike"></a>
# **usersIdLike**
> UsersLikesCreateResponse usersIdLike(usersLikesCreateRequestid)

Causes the user (in the path) to like the specified tweet

Causes the user (in the path) to like the specified tweet. The user in the path must match the user context authorizing the request.

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    UsersLikesCreateRequest usersLikesCreateRequest = new UsersLikesCreateRequest(); // UsersLikesCreateRequest | 
    String id = "id_example"; // String | The ID of the user that is requesting to like the tweet
    try {
           UsersLikesCreateResponse result = apiInstance.tweets().usersIdLike(usersLikesCreateRequest, id);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersLikesCreateRequest** | [**UsersLikesCreateRequest**](UsersLikesCreateRequest.md)|  | [optional]
 **id** | **String**| The ID of the user that is requesting to like the tweet |

### Return type

[**UsersLikesCreateResponse**](UsersLikesCreateResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdLikedTweets"></a>
# **usersIdLikedTweets**
> UsersIdLikedTweetsResponse usersIdLikedTweets(idmaxResultspaginationTokenexpansionstweetFieldsuserFieldsmediaFieldsplaceFieldspollFields)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String id = "id_example"; // String | The ID of the User to list the liked Tweets of
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    try {
           UsersIdLikedTweetsResponse result = apiInstance.tweets().usersIdLikedTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the User to list the liked Tweets of |
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**UsersIdLikedTweetsResponse**](UsersIdLikedTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdMentions"></a>
# **usersIdMentions**
> GenericTweetsTimelineResponse usersIdMentions(idsinceIduntilIdmaxResultspaginationTokenstartTimeendTimeexpansionstweetFieldsuserFieldsmediaFieldsplaceFieldspollFields)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String id = "id_example"; // String | The ID of the User to list mentions of
    String sinceId = "791775337160081409"; // String | The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
    String untilId = "1346889436626259968"; // String | The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    try {
           GenericTweetsTimelineResponse result = apiInstance.tweets().usersIdMentions(id, sinceId, untilId, maxResults, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the User to list mentions of |
 **sinceId** | **String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional]
 **untilId** | **String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional]
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**GenericTweetsTimelineResponse**](GenericTweetsTimelineResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdRetweets"></a>
# **usersIdRetweets**
> UsersRetweetsCreateResponse usersIdRetweets(usersRetweetsCreateRequestid)

Causes the user (in the path) to retweet the specified tweet

Causes the user (in the path) to retweet the specified tweet. The user in the path must match the user context authorizing the request.

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    UsersRetweetsCreateRequest usersRetweetsCreateRequest = new UsersRetweetsCreateRequest(); // UsersRetweetsCreateRequest | 
    String id = "id_example"; // String | The ID of the user that is requesting to retweet the tweet
    try {
           UsersRetweetsCreateResponse result = apiInstance.tweets().usersIdRetweets(usersRetweetsCreateRequest, id);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersRetweetsCreateRequest** | [**UsersRetweetsCreateRequest**](UsersRetweetsCreateRequest.md)|  | [optional]
 **id** | **String**| The ID of the user that is requesting to retweet the tweet |

### Return type

[**UsersRetweetsCreateResponse**](UsersRetweetsCreateResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdTweets"></a>
# **usersIdTweets**
> GenericTweetsTimelineResponse usersIdTweets(idsinceIduntilIdmaxResultsexcludepaginationTokenstartTimeendTimeexpansionstweetFieldsuserFieldsmediaFieldsplaceFieldspollFields)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String id = "id_example"; // String | The ID of the User to list Tweets of
    String sinceId = "791775337160081409"; // String | The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
    String untilId = "1346889436626259968"; // String | The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
    Integer maxResults = 56; // Integer | The maximum number of results
    Set<String> exclude = new HashSet<>(Arrays.asList()); // Set<String> | The set of entities to exclude (e.g. 'replies' or 'retweets')
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    try {
           GenericTweetsTimelineResponse result = apiInstance.tweets().usersIdTweets(id, sinceId, untilId, maxResults, exclude, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the User to list Tweets of |
 **sinceId** | **String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional]
 **untilId** | **String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional]
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **exclude** | [**Set&lt;String&gt;**](String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;) | [optional] [enum: replies, retweets]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional]
 **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**GenericTweetsTimelineResponse**](GenericTweetsTimelineResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdUnlike"></a>
# **usersIdUnlike**
> UsersLikesDeleteResponse usersIdUnlike(idtweetId)

Causes the user (in the path) to unlike the specified tweet

Causes the user (in the path) to unlike the specified tweet. The user must match the user context authorizing the request

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String id = "id_example"; // String | The ID of the user that is requesting to unlike the tweet
    String tweetId = "tweetId_example"; // String | The ID of the tweet that the user is requesting to unlike
    try {
           UsersLikesDeleteResponse result = apiInstance.tweets().usersIdUnlike(id, tweetId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user that is requesting to unlike the tweet |
 **tweetId** | **String**| The ID of the tweet that the user is requesting to unlike |

### Return type

[**UsersLikesDeleteResponse**](UsersLikesDeleteResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdUnretweets"></a>
# **usersIdUnretweets**
> UsersRetweetsDeleteResponse usersIdUnretweets(idsourceTweetId)

Causes the user (in the path) to unretweet the specified tweet

Causes the user (in the path) to unretweet the specified tweet. The user must match the user context authorizing the request

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.TweetsApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String id = "id_example"; // String | The ID of the user that is requesting to unretweet the tweet
    String sourceTweetId = "sourceTweetId_example"; // String | The ID of the tweet that the user is requesting to unretweet
    try {
           UsersRetweetsDeleteResponse result = apiInstance.tweets().usersIdUnretweets(id, sourceTweetId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user that is requesting to unretweet the tweet |
 **sourceTweetId** | **String**| The ID of the tweet that the user is requesting to unretweet |

### Return type

[**UsersRetweetsDeleteResponse**](UsersRetweetsDeleteResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken), [UserToken](../README.md#UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

