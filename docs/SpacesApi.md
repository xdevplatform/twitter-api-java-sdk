# SpacesApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findSpaceById**](SpacesApi.md#findSpaceById) | **GET** /2/spaces/{id} | Space lookup by Space ID
[**findSpacesByCreatorIds**](SpacesApi.md#findSpacesByCreatorIds) | **GET** /2/spaces/by/creator_ids | Space lookup by their creators
[**findSpacesByIds**](SpacesApi.md#findSpacesByIds) | **GET** /2/spaces | Space lookup up Space IDs
[**searchSpaces**](SpacesApi.md#searchSpaces) | **GET** /2/spaces/search | Search for Spaces
[**spaceBuyers**](SpacesApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of users who purchased a ticket to the given space
[**spaceTweets**](SpacesApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve tweets from a Space


<a name="findSpaceById"></a>
# **findSpaceById**
> SingleSpaceLookupResponse findSpaceById(idspaceFieldsexpansions)

Space lookup by Space ID

Returns a variety of information about the Space specified by the requested ID

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

import com.twitter.clientlib.api.SpacesApi;
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
    String id = "id_example"; // String | The space id to be retrieved
    Set<String> spaceFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Space fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    try {
           SingleSpaceLookupResponse result = apiInstance.spaces().findSpaceById(id, spaceFields, expansions);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#findSpaceById");
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
 **id** | **String**| The space id to be retrieved |
 **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, host_ids, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, title, updated_at]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids]

### Return type

[**SingleSpaceLookupResponse**](SingleSpaceLookupResponse.md)

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

<a name="findSpacesByCreatorIds"></a>
# **findSpacesByCreatorIds**
> MultiSpaceLookupResponse findSpacesByCreatorIds(userIdsspaceFieldsexpansions)

Space lookup by their creators

Returns a variety of information about the Spaces created by the provided User IDs

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

import com.twitter.clientlib.api.SpacesApi;
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
    List<String> userIds = Arrays.asList(); // List<String> | The users to search through
    Set<String> spaceFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Space fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    try {
           MultiSpaceLookupResponse result = apiInstance.spaces().findSpacesByCreatorIds(userIds, spaceFields, expansions);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#findSpacesByCreatorIds");
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
 **userIds** | [**List&lt;String&gt;**](String.md)| The users to search through |
 **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, host_ids, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, title, updated_at]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids]

### Return type

[**MultiSpaceLookupResponse**](MultiSpaceLookupResponse.md)

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

<a name="findSpacesByIds"></a>
# **findSpacesByIds**
> MultiSpaceLookupResponse findSpacesByIds(idsspaceFieldsexpansions)

Space lookup up Space IDs

Returns a variety of information about the Spaces specified by the requested IDs

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

import com.twitter.clientlib.api.SpacesApi;
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
    List<String> ids = Arrays.asList(); // List<String> | A list of space ids
    Set<String> spaceFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Space fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    try {
           MultiSpaceLookupResponse result = apiInstance.spaces().findSpacesByIds(ids, spaceFields, expansions);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#findSpacesByIds");
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
 **ids** | [**List&lt;String&gt;**](String.md)| A list of space ids |
 **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, host_ids, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, title, updated_at]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids]

### Return type

[**MultiSpaceLookupResponse**](MultiSpaceLookupResponse.md)

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

<a name="searchSpaces"></a>
# **searchSpaces**
> MultiSpaceLookupResponse searchSpaces(querystatemaxResultsspaceFieldsexpansions)

Search for Spaces

Returns Spaces that match the provided query.

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

import com.twitter.clientlib.api.SpacesApi;
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
    String query = "crypto"; // String | The search query
    String state = "live"; // String | The state of spaces to search for
    Integer maxResults = 56; // Integer | The number of results to return. The maximum for this value is 100.
    Set<String> spaceFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Space fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    try {
           MultiSpaceLookupResponse result = apiInstance.spaces().searchSpaces(query, state, maxResults, spaceFields, expansions);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#searchSpaces");
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
 **query** | **String**| The search query |
 **state** | **String**| The state of spaces to search for | [optional] [default to all] [enum: live, scheduled, all]
 **maxResults** | **Integer**| The number of results to return. The maximum for this value is 100. | [optional]
 **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, host_ids, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, title, updated_at]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids]

### Return type

[**MultiSpaceLookupResponse**](MultiSpaceLookupResponse.md)

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

import com.twitter.clientlib.api.SpacesApi;
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
      System.err.println("Exception when calling SpacesApi#spaceBuyers");
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

import com.twitter.clientlib.api.SpacesApi;
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
      System.err.println("Exception when calling SpacesApi#spaceTweets");
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

