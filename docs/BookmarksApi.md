# BookmarksApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsersIdBookmarks**](BookmarksApi.md#getUsersIdBookmarks) | **GET** /2/users/{id}/bookmarks | Bookmarks by User
[**postUsersIdBookmarks**](BookmarksApi.md#postUsersIdBookmarks) | **POST** /2/users/{id}/bookmarks | Add Tweet to Bookmarks
[**usersIdBookmarksDelete**](BookmarksApi.md#usersIdBookmarksDelete) | **DELETE** /2/users/{id}/bookmarks/{tweet_id} | Remove a bookmarked Tweet


<a name="getUsersIdBookmarks"></a>
# **getUsersIdBookmarks**
> GenericTweetsTimelineResponse getUsersIdBookmarks(idmaxResultspaginationTokenexpansionstweetFieldsuserFieldsmediaFieldsplaceFieldspollFields)

Bookmarks by User

Returns Tweet objects that have been bookmarked by the requesting user

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

import com.twitter.clientlib.api.BookmarksApi;
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
    String id = "id_example"; // String | The ID of the user for whom to return results
    Integer maxResults = 56; // Integer | The maximum number of results
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> placeFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Place fields to display.
    Set<String> pollFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Poll fields to display.
    try {
           GenericTweetsTimelineResponse result = apiInstance.bookmarks().getUsersIdBookmarks(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookmarksApi#getUsersIdBookmarks");
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
 **id** | **String**| The ID of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional]
 **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text]
 **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**GenericTweetsTimelineResponse**](GenericTweetsTimelineResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="postUsersIdBookmarks"></a>
# **postUsersIdBookmarks**
> BookmarkMutationResponse postUsersIdBookmarks(addBookmarkRequestid)

Add Tweet to Bookmarks

Adds a Tweet (ID in the body) to the requesting user&#39;s (in the path) bookmarks

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

import com.twitter.clientlib.api.BookmarksApi;
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
    AddBookmarkRequest addBookmarkRequest = new AddBookmarkRequest(); // AddBookmarkRequest | 
    String id = "id_example"; // String | The ID of the user for whom to add bookmarks
    try {
           BookmarkMutationResponse result = apiInstance.bookmarks().postUsersIdBookmarks(addBookmarkRequest, id);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookmarksApi#postUsersIdBookmarks");
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
 **addBookmarkRequest** | [**AddBookmarkRequest**](AddBookmarkRequest.md)|  |
 **id** | **String**| The ID of the user for whom to add bookmarks |

### Return type

[**BookmarkMutationResponse**](BookmarkMutationResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

<a name="usersIdBookmarksDelete"></a>
# **usersIdBookmarksDelete**
> BookmarkMutationResponse usersIdBookmarksDelete(idtweetId)

Remove a bookmarked Tweet

Removes a Tweet from the requesting user&#39;s bookmarked Tweets.

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

import com.twitter.clientlib.api.BookmarksApi;
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
    String id = "id_example"; // String | The ID of the user whose bookmark is to be removed.
    String tweetId = "tweetId_example"; // String | The ID of the tweet that the user is removing from bookmarks
    try {
           BookmarkMutationResponse result = apiInstance.bookmarks().usersIdBookmarksDelete(id, tweetId);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookmarksApi#usersIdBookmarksDelete");
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
 **id** | **String**| The ID of the user whose bookmark is to be removed. |
 **tweetId** | **String**| The ID of the tweet that the user is removing from bookmarks |

### Return type

[**BookmarkMutationResponse**](BookmarkMutationResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jsonapplication/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request was successful |  -  |
**0** | The request has failed. |  -  |

