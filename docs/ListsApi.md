# ListsApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserListMemberships**](ListsApi.md#getUserListMemberships) | **GET** /2/users/{id}/list_memberships | Get a User&#39;s List Memberships |
| [**listAddMember**](ListsApi.md#listAddMember) | **POST** /2/lists/{id}/members | Add a List member |
| [**listIdCreate**](ListsApi.md#listIdCreate) | **POST** /2/lists | Create List |
| [**listIdDelete**](ListsApi.md#listIdDelete) | **DELETE** /2/lists/{id} | Delete List |
| [**listIdGet**](ListsApi.md#listIdGet) | **GET** /2/lists/{id} | List lookup by List ID. |
| [**listIdUpdate**](ListsApi.md#listIdUpdate) | **PUT** /2/lists/{id} | Update List. |
| [**listRemoveMember**](ListsApi.md#listRemoveMember) | **DELETE** /2/lists/{id}/members/{user_id} | Remove a List member |
| [**listUserFollow**](ListsApi.md#listUserFollow) | **POST** /2/users/{id}/followed_lists | Follow a List |
| [**listUserOwnedLists**](ListsApi.md#listUserOwnedLists) | **GET** /2/users/{id}/owned_lists | Get a User&#39;s Owned Lists. |
| [**listUserPin**](ListsApi.md#listUserPin) | **POST** /2/users/{id}/pinned_lists | Pin a List |
| [**listUserPinnedLists**](ListsApi.md#listUserPinnedLists) | **GET** /2/users/{id}/pinned_lists | Get a User&#39;s Pinned Lists |
| [**listUserUnfollow**](ListsApi.md#listUserUnfollow) | **DELETE** /2/users/{id}/followed_lists/{list_id} | Unfollow a List |
| [**listUserUnpin**](ListsApi.md#listUserUnpin) | **DELETE** /2/users/{id}/pinned_lists/{list_id} | Unpin a List |
| [**userFollowedLists**](ListsApi.md#userFollowedLists) | **GET** /2/users/{id}/followed_lists | Get User&#39;s Followed Lists |


<a name="getUserListMemberships"></a>
# **getUserListMemberships**
> Get2UsersIdListMembershipsResponse getUserListMemberships(id).maxResults(maxResults).paginationToken(paginationToken).listFields(listFields).expansions(expansions).userFields(userFields).execute();

Get a User&#39;s List Memberships

Get a User&#39;s List Memberships.

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

import com.twitter.clientlib.api.ListsApi;
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
    Integer maxResults = 100; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Set<String> listFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    try {
           Get2UsersIdListMembershipsResponse result = apiInstance.lists().getUserListMemberships(id)
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .listFields(listFields)
            .expansions(expansions)
            .userFields(userFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getUserListMemberships");
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
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |

### Return type

[**Get2UsersIdListMembershipsResponse**](Get2UsersIdListMembershipsResponse.md)

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

<a name="listAddMember"></a>
# **listAddMember**
> ListMutateResponse listAddMember(id).listAddUserRequest(listAddUserRequest).execute();

Add a List member

Causes a User to become a member of a List.

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

import com.twitter.clientlib.api.ListsApi;
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
    ListAddUserRequest listAddUserRequest = new ListAddUserRequest(); // ListAddUserRequest | 
    String id = "id_example"; // String | The ID of the List for which to add a member.
    try {
           ListMutateResponse result = apiInstance.lists().listAddMember(id)
            .listAddUserRequest(listAddUserRequest)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listAddMember");
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
| **listAddUserRequest** | [**ListAddUserRequest**](ListAddUserRequest.md)|  | [optional] |
| **id** | **String**| The ID of the List for which to add a member. | |

### Return type

[**ListMutateResponse**](ListMutateResponse.md)

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

<a name="listIdCreate"></a>
# **listIdCreate**
> ListCreateResponse listIdCreate().listCreateRequest(listCreateRequest).execute();

Create List

Creates a new List.

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

import com.twitter.clientlib.api.ListsApi;
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
    ListCreateRequest listCreateRequest = new ListCreateRequest(); // ListCreateRequest | 
    try {
           ListCreateResponse result = apiInstance.lists().listIdCreate()
            .listCreateRequest(listCreateRequest)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listIdCreate");
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
| **listCreateRequest** | [**ListCreateRequest**](ListCreateRequest.md)|  | [optional] |

### Return type

[**ListCreateResponse**](ListCreateResponse.md)

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

<a name="listIdDelete"></a>
# **listIdDelete**
> ListDeleteResponse listIdDelete(id).execute();

Delete List

Delete a List that you own.

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

import com.twitter.clientlib.api.ListsApi;
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
    String id = "id_example"; // String | The ID of the List to delete.
    try {
           ListDeleteResponse result = apiInstance.lists().listIdDelete(id)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listIdDelete");
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
| **id** | **String**| The ID of the List to delete. | |

### Return type

[**ListDeleteResponse**](ListDeleteResponse.md)

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

<a name="listIdGet"></a>
# **listIdGet**
> Get2ListsIdResponse listIdGet(id).listFields(listFields).expansions(expansions).userFields(userFields).execute();

List lookup by List ID.

Returns a List.

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

import com.twitter.clientlib.api.ListsApi;
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
    Set<String> listFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    try {
           Get2ListsIdResponse result = apiInstance.lists().listIdGet(id)
            .listFields(listFields)
            .expansions(expansions)
            .userFields(userFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listIdGet");
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
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |

### Return type

[**Get2ListsIdResponse**](Get2ListsIdResponse.md)

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

<a name="listIdUpdate"></a>
# **listIdUpdate**
> ListUpdateResponse listIdUpdate(id).listUpdateRequest(listUpdateRequest).execute();

Update List.

Update a List that you own.

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

import com.twitter.clientlib.api.ListsApi;
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
    ListUpdateRequest listUpdateRequest = new ListUpdateRequest(); // ListUpdateRequest | 
    String id = "id_example"; // String | The ID of the List to modify.
    try {
           ListUpdateResponse result = apiInstance.lists().listIdUpdate(id)
            .listUpdateRequest(listUpdateRequest)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listIdUpdate");
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
| **listUpdateRequest** | [**ListUpdateRequest**](ListUpdateRequest.md)|  | [optional] |
| **id** | **String**| The ID of the List to modify. | |

### Return type

[**ListUpdateResponse**](ListUpdateResponse.md)

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

<a name="listRemoveMember"></a>
# **listRemoveMember**
> ListMutateResponse listRemoveMember(id, userId).execute();

Remove a List member

Causes a User to be removed from the members of a List.

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

import com.twitter.clientlib.api.ListsApi;
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
    String id = "id_example"; // String | The ID of the List to remove a member.
    String userId = "userId_example"; // String | The ID of User that will be removed from the List.
    try {
           ListMutateResponse result = apiInstance.lists().listRemoveMember(id, userId)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listRemoveMember");
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
| **id** | **String**| The ID of the List to remove a member. | |
| **userId** | **String**| The ID of User that will be removed from the List. | |

### Return type

[**ListMutateResponse**](ListMutateResponse.md)

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

<a name="listUserFollow"></a>
# **listUserFollow**
> ListFollowedResponse listUserFollow(id).listFollowedRequest(listFollowedRequest).execute();

Follow a List

Causes a User to follow a List.

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

import com.twitter.clientlib.api.ListsApi;
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
    ListFollowedRequest listFollowedRequest = new ListFollowedRequest(); // ListFollowedRequest | 
    String id = "id_example"; // String | The ID of the authenticated source User that will follow the List.
    try {
           ListFollowedResponse result = apiInstance.lists().listUserFollow(id)
            .listFollowedRequest(listFollowedRequest)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listUserFollow");
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
| **listFollowedRequest** | [**ListFollowedRequest**](ListFollowedRequest.md)|  | [optional] |
| **id** | **String**| The ID of the authenticated source User that will follow the List. | |

### Return type

[**ListFollowedResponse**](ListFollowedResponse.md)

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

<a name="listUserOwnedLists"></a>
# **listUserOwnedLists**
> Get2UsersIdOwnedListsResponse listUserOwnedLists(id).maxResults(maxResults).paginationToken(paginationToken).listFields(listFields).expansions(expansions).userFields(userFields).execute();

Get a User&#39;s Owned Lists.

Get a User&#39;s Owned Lists.

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

import com.twitter.clientlib.api.ListsApi;
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
    Integer maxResults = 100; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Set<String> listFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    try {
           Get2UsersIdOwnedListsResponse result = apiInstance.lists().listUserOwnedLists(id)
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .listFields(listFields)
            .expansions(expansions)
            .userFields(userFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listUserOwnedLists");
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
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |

### Return type

[**Get2UsersIdOwnedListsResponse**](Get2UsersIdOwnedListsResponse.md)

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

<a name="listUserPin"></a>
# **listUserPin**
> ListPinnedResponse listUserPin(listPinnedRequest, id).execute();

Pin a List

Causes a User to pin a List.

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

import com.twitter.clientlib.api.ListsApi;
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
    ListPinnedRequest listPinnedRequest = new ListPinnedRequest(); // ListPinnedRequest | 
    String id = "id_example"; // String | The ID of the authenticated source User that will pin the List.
    try {
           ListPinnedResponse result = apiInstance.lists().listUserPin(listPinnedRequest, id)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listUserPin");
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
| **listPinnedRequest** | [**ListPinnedRequest**](ListPinnedRequest.md)|  | |
| **id** | **String**| The ID of the authenticated source User that will pin the List. | |

### Return type

[**ListPinnedResponse**](ListPinnedResponse.md)

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

<a name="listUserPinnedLists"></a>
# **listUserPinnedLists**
> Get2UsersIdPinnedListsResponse listUserPinnedLists(id).listFields(listFields).expansions(expansions).userFields(userFields).execute();

Get a User&#39;s Pinned Lists

Get a User&#39;s Pinned Lists.

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

import com.twitter.clientlib.api.ListsApi;
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
    Set<String> listFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    try {
           Get2UsersIdPinnedListsResponse result = apiInstance.lists().listUserPinnedLists(id)
            .listFields(listFields)
            .expansions(expansions)
            .userFields(userFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listUserPinnedLists");
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
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |

### Return type

[**Get2UsersIdPinnedListsResponse**](Get2UsersIdPinnedListsResponse.md)

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

<a name="listUserUnfollow"></a>
# **listUserUnfollow**
> ListFollowedResponse listUserUnfollow(id, listId).execute();

Unfollow a List

Causes a User to unfollow a List.

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

import com.twitter.clientlib.api.ListsApi;
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
    String id = "id_example"; // String | The ID of the authenticated source User that will unfollow the List.
    String listId = "listId_example"; // String | The ID of the List to unfollow.
    try {
           ListFollowedResponse result = apiInstance.lists().listUserUnfollow(id, listId)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listUserUnfollow");
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
| **id** | **String**| The ID of the authenticated source User that will unfollow the List. | |
| **listId** | **String**| The ID of the List to unfollow. | |

### Return type

[**ListFollowedResponse**](ListFollowedResponse.md)

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

<a name="listUserUnpin"></a>
# **listUserUnpin**
> ListUnpinResponse listUserUnpin(id, listId).execute();

Unpin a List

Causes a User to remove a pinned List.

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

import com.twitter.clientlib.api.ListsApi;
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
    String listId = "listId_example"; // String | The ID of the List to unpin.
    try {
           ListUnpinResponse result = apiInstance.lists().listUserUnpin(id, listId)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#listUserUnpin");
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
| **listId** | **String**| The ID of the List to unpin. | |

### Return type

[**ListUnpinResponse**](ListUnpinResponse.md)

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

<a name="userFollowedLists"></a>
# **userFollowedLists**
> Get2UsersIdFollowedListsResponse userFollowedLists(id).maxResults(maxResults).paginationToken(paginationToken).listFields(listFields).expansions(expansions).userFields(userFields).execute();

Get User&#39;s Followed Lists

Returns a User&#39;s followed Lists.

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

import com.twitter.clientlib.api.ListsApi;
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
    Integer maxResults = 100; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Set<String> listFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    try {
           Get2UsersIdFollowedListsResponse result = apiInstance.lists().userFollowedLists(id)
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .listFields(listFields)
            .expansions(expansions)
            .userFields(userFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#userFollowedLists");
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
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |

### Return type

[**Get2UsersIdFollowedListsResponse**](Get2UsersIdFollowedListsResponse.md)

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

