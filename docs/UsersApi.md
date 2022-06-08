# UsersApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findMyUser**](UsersApi.md#findMyUser) | **GET** /2/users/me | User lookup me |
| [**findUserById**](UsersApi.md#findUserById) | **GET** /2/users/{id} | User lookup by ID |
| [**findUserByUsername**](UsersApi.md#findUserByUsername) | **GET** /2/users/by/username/{username} | User lookup by username |
| [**findUsersById**](UsersApi.md#findUsersById) | **GET** /2/users | User lookup by IDs |
| [**findUsersByUsername**](UsersApi.md#findUsersByUsername) | **GET** /2/users/by | User lookup by usernames |
| [**listGetFollowers**](UsersApi.md#listGetFollowers) | **GET** /2/lists/{id}/followers | Returns User objects that follow a List by the provided List ID |
| [**listGetMembers**](UsersApi.md#listGetMembers) | **GET** /2/lists/{id}/members | Returns User objects that are members of a List by the provided List ID. |
| [**tweetsIdLikingUsers**](UsersApi.md#tweetsIdLikingUsers) | **GET** /2/tweets/{id}/liking_users | Returns User objects that have liked the provided Tweet ID |
| [**tweetsIdRetweetingUsers**](UsersApi.md#tweetsIdRetweetingUsers) | **GET** /2/tweets/{id}/retweeted_by | Returns User objects that have retweeted the provided Tweet ID |
| [**usersIdBlock**](UsersApi.md#usersIdBlock) | **POST** /2/users/{id}/blocking | Block User by User ID |
| [**usersIdBlocking**](UsersApi.md#usersIdBlocking) | **GET** /2/users/{id}/blocking | Returns User objects that are blocked by provided User ID |
| [**usersIdFollow**](UsersApi.md#usersIdFollow) | **POST** /2/users/{id}/following | Follow User |
| [**usersIdFollowers**](UsersApi.md#usersIdFollowers) | **GET** /2/users/{id}/followers | Returns User objects that follow a List by the provided User ID |
| [**usersIdFollowing**](UsersApi.md#usersIdFollowing) | **GET** /2/users/{id}/following | Following by User ID |
| [**usersIdMute**](UsersApi.md#usersIdMute) | **POST** /2/users/{id}/muting | Mute User by User ID. |
| [**usersIdMuting**](UsersApi.md#usersIdMuting) | **GET** /2/users/{id}/muting | Returns User objects that are muted by the provided User ID |
| [**usersIdUnblock**](UsersApi.md#usersIdUnblock) | **DELETE** /2/users/{source_user_id}/blocking/{target_user_id} | Unblock User by User ID |
| [**usersIdUnfollow**](UsersApi.md#usersIdUnfollow) | **DELETE** /2/users/{source_user_id}/following/{target_user_id} | Unfollow User |
| [**usersIdUnmute**](UsersApi.md#usersIdUnmute) | **DELETE** /2/users/{source_user_id}/muting/{target_user_id} | Unmute User by User ID |


<a name="findMyUser"></a>
# **findMyUser**
> Get2UsersMeResponse findMyUser(userFields, expansions, tweetFields)

User lookup me

This endpoint returns information about the requesting User.

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

import com.twitter.clientlib.api.UsersApi;
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
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2UsersMeResponse result = apiInstance.users().findMyUser(userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#findMyUser");
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
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersMeResponse**](Get2UsersMeResponse.md)

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

<a name="findUserById"></a>
# **findUserById**
> Get2UsersIdResponse findUserById(id, userFields, expansions, tweetFields)

User lookup by ID

This endpoint returns information about a User. Specify User by ID.

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

import com.twitter.clientlib.api.UsersApi;
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
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2UsersIdResponse result = apiInstance.users().findUserById(id, userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#findUserById");
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
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersIdResponse**](Get2UsersIdResponse.md)

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

<a name="findUserByUsername"></a>
# **findUserByUsername**
> Get2UsersByUsernameUsernameResponse findUserByUsername(username, userFields, expansions, tweetFields)

User lookup by username

This endpoint returns information about a User. Specify User by username.

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

import com.twitter.clientlib.api.UsersApi;
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
    String username = "TwitterDev"; // String | A username.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2UsersByUsernameUsernameResponse result = apiInstance.users().findUserByUsername(username, userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#findUserByUsername");
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
| **username** | **String**| A username. | |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersByUsernameUsernameResponse**](Get2UsersByUsernameUsernameResponse.md)

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

<a name="findUsersById"></a>
# **findUsersById**
> Get2UsersResponse findUsersById(ids, userFields, expansions, tweetFields)

User lookup by IDs

This endpoint returns information about Users. Specify Users by their ID.

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

import com.twitter.clientlib.api.UsersApi;
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
    List<String> ids = Arrays.asList(); // List<String> | A list of User IDs, comma-separated. You can specify up to 100 IDs.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2UsersResponse result = apiInstance.users().findUsersById(ids, userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#findUsersById");
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
| **ids** | [**List&lt;String&gt;**](String.md)| A list of User IDs, comma-separated. You can specify up to 100 IDs. | |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersResponse**](Get2UsersResponse.md)

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

<a name="findUsersByUsername"></a>
# **findUsersByUsername**
> Get2UsersByResponse findUsersByUsername(usernames, userFields, expansions, tweetFields)

User lookup by usernames

This endpoint returns information about Users. Specify Users by their username.

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

import com.twitter.clientlib.api.UsersApi;
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
    List<String> usernames = Arrays.asList(); // List<String> | A list of usernames, comma-separated.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2UsersByResponse result = apiInstance.users().findUsersByUsername(usernames, userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#findUsersByUsername");
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
| **usernames** | [**List&lt;String&gt;**](String.md)| A list of usernames, comma-separated. | |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersByResponse**](Get2UsersByResponse.md)

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

<a name="listGetFollowers"></a>
# **listGetFollowers**
> Get2ListsIdFollowersResponse listGetFollowers(id, maxResults, paginationToken, userFields, expansions, tweetFields)

Returns User objects that follow a List by the provided List ID

Returns a list of Users that follow a List by the provided List ID

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

import com.twitter.clientlib.api.UsersApi;
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
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2ListsIdFollowersResponse result = apiInstance.users().listGetFollowers(id, maxResults, paginationToken, userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listGetFollowers");
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
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2ListsIdFollowersResponse**](Get2ListsIdFollowersResponse.md)

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

<a name="listGetMembers"></a>
# **listGetMembers**
> Get2ListsIdMembersResponse listGetMembers(id, maxResults, paginationToken, userFields, expansions, tweetFields)

Returns User objects that are members of a List by the provided List ID.

Returns a list of Users that are members of a List by the provided List ID.

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

import com.twitter.clientlib.api.UsersApi;
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
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2ListsIdMembersResponse result = apiInstance.users().listGetMembers(id, maxResults, paginationToken, userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listGetMembers");
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
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2ListsIdMembersResponse**](Get2ListsIdMembersResponse.md)

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

<a name="tweetsIdLikingUsers"></a>
# **tweetsIdLikingUsers**
> Get2TweetsIdLikingUsersResponse tweetsIdLikingUsers(id, maxResults, paginationToken, userFields, expansions, tweetFields)

Returns User objects that have liked the provided Tweet ID

Returns a list of Users that have liked the provided Tweet ID

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

import com.twitter.clientlib.api.UsersApi;
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
    Integer maxResults = 100; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2TweetsIdLikingUsersResponse result = apiInstance.users().tweetsIdLikingUsers(id, maxResults, paginationToken, userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#tweetsIdLikingUsers");
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
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2TweetsIdLikingUsersResponse**](Get2TweetsIdLikingUsersResponse.md)

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

<a name="tweetsIdRetweetingUsers"></a>
# **tweetsIdRetweetingUsers**
> Get2TweetsIdRetweetedByResponse tweetsIdRetweetingUsers(id, maxResults, paginationToken, userFields, expansions, tweetFields)

Returns User objects that have retweeted the provided Tweet ID

Returns a list of Users that have retweeted the provided Tweet ID

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

import com.twitter.clientlib.api.UsersApi;
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
    Integer maxResults = 100; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2TweetsIdRetweetedByResponse result = apiInstance.users().tweetsIdRetweetingUsers(id, maxResults, paginationToken, userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#tweetsIdRetweetingUsers");
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
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2TweetsIdRetweetedByResponse**](Get2TweetsIdRetweetedByResponse.md)

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

<a name="usersIdBlock"></a>
# **usersIdBlock**
> BlockUserMutationResponse usersIdBlock(blockUserRequest, id)

Block User by User ID

Causes the User (in the path) to block the target User. The User (in the path) must match the User context authorizing the request

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

import com.twitter.clientlib.api.UsersApi;
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
    BlockUserRequest blockUserRequest = new BlockUserRequest(); // BlockUserRequest | 
    String id = "id_example"; // String | The ID of the authenticated source User that is requesting to block the target User.
    try {
           BlockUserMutationResponse result = apiInstance.users().usersIdBlock(blockUserRequest, id);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersIdBlock");
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
| **blockUserRequest** | [**BlockUserRequest**](BlockUserRequest.md)|  | |
| **id** | **String**| The ID of the authenticated source User that is requesting to block the target User. | |

### Return type

[**BlockUserMutationResponse**](BlockUserMutationResponse.md)

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

<a name="usersIdBlocking"></a>
# **usersIdBlocking**
> Get2UsersIdBlockingResponse usersIdBlocking(id, maxResults, paginationToken, userFields, expansions, tweetFields)

Returns User objects that are blocked by provided User ID

Returns a list of Users that are blocked by the provided User ID

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

import com.twitter.clientlib.api.UsersApi;
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
    String id = "id_example"; // String | The ID of the authenticated source User for whom to return results.
    Integer maxResults = 56; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2UsersIdBlockingResponse result = apiInstance.users().usersIdBlocking(id, maxResults, paginationToken, userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersIdBlocking");
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
| **id** | **String**| The ID of the authenticated source User for whom to return results. | |
| **maxResults** | **Integer**| The maximum number of results. | [optional] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersIdBlockingResponse**](Get2UsersIdBlockingResponse.md)

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

<a name="usersIdFollow"></a>
# **usersIdFollow**
> UsersFollowingCreateResponse usersIdFollow(usersFollowingCreateRequest, id)

Follow User

Causes the User(in the path) to follow, or “request to follow” for protected Users, the target User. The User(in the path) must match the User context authorizing the request

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

import com.twitter.clientlib.api.UsersApi;
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
    UsersFollowingCreateRequest usersFollowingCreateRequest = new UsersFollowingCreateRequest(); // UsersFollowingCreateRequest | 
    String id = "id_example"; // String | The ID of the authenticated source User that is requesting to follow the target User.
    try {
           UsersFollowingCreateResponse result = apiInstance.users().usersIdFollow(usersFollowingCreateRequest, id);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersIdFollow");
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
| **usersFollowingCreateRequest** | [**UsersFollowingCreateRequest**](UsersFollowingCreateRequest.md)|  | [optional] |
| **id** | **String**| The ID of the authenticated source User that is requesting to follow the target User. | |

### Return type

[**UsersFollowingCreateResponse**](UsersFollowingCreateResponse.md)

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

<a name="usersIdFollowers"></a>
# **usersIdFollowers**
> Get2UsersIdFollowersResponse usersIdFollowers(id, maxResults, paginationToken, userFields, expansions, tweetFields)

Returns User objects that follow a List by the provided User ID

Returns a list of Users that follow the provided User ID

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

import com.twitter.clientlib.api.UsersApi;
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
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2UsersIdFollowersResponse result = apiInstance.users().usersIdFollowers(id, maxResults, paginationToken, userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersIdFollowers");
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
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersIdFollowersResponse**](Get2UsersIdFollowersResponse.md)

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

<a name="usersIdFollowing"></a>
# **usersIdFollowing**
> Get2UsersIdFollowingResponse usersIdFollowing(id, maxResults, paginationToken, userFields, expansions, tweetFields)

Following by User ID

Returns a list of Users that are being followed by the provided User ID

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

import com.twitter.clientlib.api.UsersApi;
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
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2UsersIdFollowingResponse result = apiInstance.users().usersIdFollowing(id, maxResults, paginationToken, userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersIdFollowing");
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
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersIdFollowingResponse**](Get2UsersIdFollowingResponse.md)

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

<a name="usersIdMute"></a>
# **usersIdMute**
> MuteUserMutationResponse usersIdMute(muteUserRequest, id)

Mute User by User ID.

Causes the User (in the path) to mute the target User. The User (in the path) must match the User context authorizing the request.

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

import com.twitter.clientlib.api.UsersApi;
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
    MuteUserRequest muteUserRequest = new MuteUserRequest(); // MuteUserRequest | 
    String id = "id_example"; // String | The ID of the authenticated source User that is requesting to mute the target User.
    try {
           MuteUserMutationResponse result = apiInstance.users().usersIdMute(muteUserRequest, id);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersIdMute");
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
| **muteUserRequest** | [**MuteUserRequest**](MuteUserRequest.md)|  | [optional] |
| **id** | **String**| The ID of the authenticated source User that is requesting to mute the target User. | |

### Return type

[**MuteUserMutationResponse**](MuteUserMutationResponse.md)

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

<a name="usersIdMuting"></a>
# **usersIdMuting**
> Get2UsersIdMutingResponse usersIdMuting(id, maxResults, paginationToken, userFields, expansions, tweetFields)

Returns User objects that are muted by the provided User ID

Returns a list of Users that are muted by the provided User ID

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

import com.twitter.clientlib.api.UsersApi;
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
    String id = "id_example"; // String | The ID of the authenticated source User for whom to return results.
    Integer maxResults = 100; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get the next 'page' of results.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2UsersIdMutingResponse result = apiInstance.users().usersIdMuting(id, maxResults, paginationToken, userFields, expansions, tweetFields);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersIdMuting");
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
| **id** | **String**| The ID of the authenticated source User for whom to return results. | |
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get the next &#39;page&#39; of results. | [optional] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2UsersIdMutingResponse**](Get2UsersIdMutingResponse.md)

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

<a name="usersIdUnblock"></a>
# **usersIdUnblock**
> BlockUserMutationResponse usersIdUnblock(sourceUserId, targetUserId)

Unblock User by User ID

Causes the source User to unblock the target User. The source User must match the User context authorizing the request

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

import com.twitter.clientlib.api.UsersApi;
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
    String sourceUserId = "sourceUserId_example"; // String | The ID of the authenticated source User that is requesting to unblock the target User.
    String targetUserId = "targetUserId_example"; // String | The ID of the User that the source User is requesting to unblock.
    try {
           BlockUserMutationResponse result = apiInstance.users().usersIdUnblock(sourceUserId, targetUserId);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersIdUnblock");
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
| **sourceUserId** | **String**| The ID of the authenticated source User that is requesting to unblock the target User. | |
| **targetUserId** | **String**| The ID of the User that the source User is requesting to unblock. | |

### Return type

[**BlockUserMutationResponse**](BlockUserMutationResponse.md)

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

<a name="usersIdUnfollow"></a>
# **usersIdUnfollow**
> UsersFollowingDeleteResponse usersIdUnfollow(sourceUserId, targetUserId)

Unfollow User

Causes the source User to unfollow the target User. The source User must match the User context authorizing the request

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

import com.twitter.clientlib.api.UsersApi;
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
    String sourceUserId = "sourceUserId_example"; // String | The ID of the authenticated source User that is requesting to unfollow the target User.
    String targetUserId = "targetUserId_example"; // String | The ID of the User that the source User is requesting to unfollow.
    try {
           UsersFollowingDeleteResponse result = apiInstance.users().usersIdUnfollow(sourceUserId, targetUserId);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersIdUnfollow");
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
| **sourceUserId** | **String**| The ID of the authenticated source User that is requesting to unfollow the target User. | |
| **targetUserId** | **String**| The ID of the User that the source User is requesting to unfollow. | |

### Return type

[**UsersFollowingDeleteResponse**](UsersFollowingDeleteResponse.md)

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

<a name="usersIdUnmute"></a>
# **usersIdUnmute**
> MuteUserMutationResponse usersIdUnmute(sourceUserId, targetUserId)

Unmute User by User ID

Causes the source User to unmute the target User. The source User must match the User context authorizing the request

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

import com.twitter.clientlib.api.UsersApi;
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
    String sourceUserId = "sourceUserId_example"; // String | The ID of the authenticated source User that is requesting to unmute the target User.
    String targetUserId = "targetUserId_example"; // String | The ID of the User that the source User is requesting to unmute.
    try {
           MuteUserMutationResponse result = apiInstance.users().usersIdUnmute(sourceUserId, targetUserId);
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersIdUnmute");
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
| **sourceUserId** | **String**| The ID of the authenticated source User that is requesting to unmute the target User. | |
| **targetUserId** | **String**| The ID of the User that the source User is requesting to unmute. | |

### Return type

[**MuteUserMutationResponse**](MuteUserMutationResponse.md)

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

