# ListsApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserListMemberships**](ListsApi.md#getUserListMemberships) | **GET** /2/users/{id}/list_memberships | Get a User&#39;s List Memberships
[**listAddMember**](ListsApi.md#listAddMember) | **POST** /2/lists/{id}/members | Add a List member
[**listIdCreate**](ListsApi.md#listIdCreate) | **POST** /2/lists | Create List
[**listIdDelete**](ListsApi.md#listIdDelete) | **DELETE** /2/lists/{id} | Delete List
[**listIdGet**](ListsApi.md#listIdGet) | **GET** /2/lists/{id} | List lookup by List ID
[**listIdUpdate**](ListsApi.md#listIdUpdate) | **PUT** /2/lists/{id} | Update List
[**listRemoveMember**](ListsApi.md#listRemoveMember) | **DELETE** /2/lists/{id}/members/{user_id} | Remove a List member
[**listUserFollow**](ListsApi.md#listUserFollow) | **POST** /2/users/{id}/followed_lists | Follow a List
[**listUserOwnedLists**](ListsApi.md#listUserOwnedLists) | **GET** /2/users/{id}/owned_lists | Get a User&#39;s Owned Lists
[**listUserPin**](ListsApi.md#listUserPin) | **POST** /2/users/{id}/pinned_lists | Pin a List
[**listUserPinnedLists**](ListsApi.md#listUserPinnedLists) | **GET** /2/users/{id}/pinned_lists | Get a User&#39;s Pinned Lists
[**listUserUnfollow**](ListsApi.md#listUserUnfollow) | **DELETE** /2/users/{id}/followed_lists/{list_id} | Unfollow a List
[**listUserUnpin**](ListsApi.md#listUserUnpin) | **DELETE** /2/users/{id}/pinned_lists/{list_id} | Unpin a List
[**userFollowedLists**](ListsApi.md#userFollowedLists) | **GET** /2/users/{id}/followed_lists | Get User&#39;s Followed Lists


<a name="getUserListMemberships"></a>
# **getUserListMemberships**
> MultiListResponse getUserListMemberships(idmaxResultspaginationTokenlistFieldsexpansionsuserFields)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.ListsApi;
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
    Integer maxResults = 100; // Integer | The maximum number of results
    Long paginationToken = 56L; // Long | This parameter is used to get a specified 'page' of results.
    Set<String> listFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    try {
           MultiListResponse result = apiInstance.lists().getUserListMemberships(id, maxResults, paginationToken, listFields, expansions, userFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiListResponse**](MultiListResponse.md)

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

<a name="listAddMember"></a>
# **listAddMember**
> ListMemberResponse listAddMember(listAddMemberRequestid)

Add a List member

Causes a user to become a member of a List.

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

import com.twitter.clientlib.api.ListsApi;
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
    ListAddMemberRequest listAddMemberRequest = new ListAddMemberRequest(); // ListAddMemberRequest | 
    String id = "id_example"; // String | The ID of the List to add a member
    try {
           ListMemberResponse result = apiInstance.lists().listAddMember(listAddMemberRequest, id);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listAddMemberRequest** | [**ListAddMemberRequest**](ListAddMemberRequest.md)|  | [optional]
 **id** | **String**| The ID of the List to add a member |

### Return type

[**ListMemberResponse**](ListMemberResponse.md)

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

<a name="listIdCreate"></a>
# **listIdCreate**
> ListCreateResponse listIdCreate(listCreateRequest)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.ListsApi;
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
    ListCreateRequest listCreateRequest = new ListCreateRequest(); // ListCreateRequest | 
    try {
           ListCreateResponse result = apiInstance.lists().listIdCreate(listCreateRequest);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listCreateRequest** | [**ListCreateRequest**](ListCreateRequest.md)|  | [optional]

### Return type

[**ListCreateResponse**](ListCreateResponse.md)

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

<a name="listIdDelete"></a>
# **listIdDelete**
> ListDeleteResponse listIdDelete(id)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.ListsApi;
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
    String id = "id_example"; // String | The ID of the List to delete
    try {
           ListDeleteResponse result = apiInstance.lists().listIdDelete(id);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the List to delete |

### Return type

[**ListDeleteResponse**](ListDeleteResponse.md)

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

<a name="listIdGet"></a>
# **listIdGet**
> SingleListLookupResponse listIdGet(idlistFieldsexpansionsuserFields)

List lookup by List ID

Returns a List

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

import com.twitter.clientlib.api.ListsApi;
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
    String id = "id_example"; // String | The ID of the List to get
    Set<String> listFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    try {
           SingleListLookupResponse result = apiInstance.lists().listIdGet(id, listFields, expansions, userFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the List to get |
 **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**SingleListLookupResponse**](SingleListLookupResponse.md)

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

<a name="listIdUpdate"></a>
# **listIdUpdate**
> ListUpdateResponse listIdUpdate(listUpdateRequestid)

Update List

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.ListsApi;
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
    ListUpdateRequest listUpdateRequest = new ListUpdateRequest(); // ListUpdateRequest | 
    String id = "id_example"; // String | The ID of the List to modify
    try {
           ListUpdateResponse result = apiInstance.lists().listIdUpdate(listUpdateRequest, id);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listUpdateRequest** | [**ListUpdateRequest**](ListUpdateRequest.md)|  | [optional]
 **id** | **String**| The ID of the List to modify |

### Return type

[**ListUpdateResponse**](ListUpdateResponse.md)

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

<a name="listRemoveMember"></a>
# **listRemoveMember**
> ListMemberResponse listRemoveMember(iduserId)

Remove a List member

Causes a user to be removed from the members of a List.

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

import com.twitter.clientlib.api.ListsApi;
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
    String id = "id_example"; // String | The ID of the List to remove a member
    String userId = "userId_example"; // String | The ID of user that will be removed from the List
    try {
           ListMemberResponse result = apiInstance.lists().listRemoveMember(id, userId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the List to remove a member |
 **userId** | **String**| The ID of user that will be removed from the List |

### Return type

[**ListMemberResponse**](ListMemberResponse.md)

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

<a name="listUserFollow"></a>
# **listUserFollow**
> ListFollowedResponse listUserFollow(listFollowRequestid)

Follow a List

Causes a user to follow a List.

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

import com.twitter.clientlib.api.ListsApi;
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
    ListFollowRequest listFollowRequest = new ListFollowRequest(); // ListFollowRequest | 
    String id = "id_example"; // String | The ID of the authenticated source user that will follow the List
    try {
           ListFollowedResponse result = apiInstance.lists().listUserFollow(listFollowRequest, id);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listFollowRequest** | [**ListFollowRequest**](ListFollowRequest.md)|  | [optional]
 **id** | **String**| The ID of the authenticated source user that will follow the List |

### Return type

[**ListFollowedResponse**](ListFollowedResponse.md)

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

<a name="listUserOwnedLists"></a>
# **listUserOwnedLists**
> MultiListResponse listUserOwnedLists(idmaxResultspaginationTokenlistFieldsexpansionsuserFields)

Get a User&#39;s Owned Lists

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.ListsApi;
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
    Integer maxResults = 100; // Integer | The maximum number of results
    Long paginationToken = 56L; // Long | This parameter is used to get a specified 'page' of results.
    Set<String> listFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    try {
           MultiListResponse result = apiInstance.lists().listUserOwnedLists(id, maxResults, paginationToken, listFields, expansions, userFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiListResponse**](MultiListResponse.md)

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

<a name="listUserPin"></a>
# **listUserPin**
> ListPinnedResponse listUserPin(listPinRequestid)

Pin a List

Causes a user to pin a List.

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

import com.twitter.clientlib.api.ListsApi;
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
    ListPinRequest listPinRequest = new ListPinRequest(); // ListPinRequest | 
    String id = "id_example"; // String | The ID of the authenticated source user that will pin the List
    try {
           ListPinnedResponse result = apiInstance.lists().listUserPin(listPinRequest, id);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listPinRequest** | [**ListPinRequest**](ListPinRequest.md)|  | [optional]
 **id** | **String**| The ID of the authenticated source user that will pin the List |

### Return type

[**ListPinnedResponse**](ListPinnedResponse.md)

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

<a name="listUserPinnedLists"></a>
# **listUserPinnedLists**
> MultiListNoPaginationResponse listUserPinnedLists(idlistFieldsexpansionsuserFields)

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
import com.twitter.clientlib.TwitterCredentialsOAuth1;
import com.twitter.clientlib.api.TwitterApi;

import com.twitter.clientlib.api.ListsApi;
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
    Set<String> listFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    try {
           MultiListNoPaginationResponse result = apiInstance.lists().listUserPinnedLists(id, listFields, expansions, userFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user for whom to return results |
 **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiListNoPaginationResponse**](MultiListNoPaginationResponse.md)

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

<a name="listUserUnfollow"></a>
# **listUserUnfollow**
> ListFollowedResponse listUserUnfollow(idlistId)

Unfollow a List

Causes a user to unfollow a List.

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

import com.twitter.clientlib.api.ListsApi;
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
    String id = "id_example"; // String | The ID of the authenticated source user that will unfollow the List
    String listId = "listId_example"; // String | The ID of the List to unfollow
    try {
           ListFollowedResponse result = apiInstance.lists().listUserUnfollow(id, listId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the authenticated source user that will unfollow the List |
 **listId** | **String**| The ID of the List to unfollow |

### Return type

[**ListFollowedResponse**](ListFollowedResponse.md)

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

<a name="listUserUnpin"></a>
# **listUserUnpin**
> ListPinnedResponse listUserUnpin(idlistId)

Unpin a List

Causes a user to remove a pinned List.

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

import com.twitter.clientlib.api.ListsApi;
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
    String id = "id_example"; // String | The ID of the authenticated source user that will remove the pinned List
    String listId = "listId_example"; // String | The ID of the List to unpin
    try {
           ListPinnedResponse result = apiInstance.lists().listUserUnpin(id, listId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the authenticated source user that will remove the pinned List |
 **listId** | **String**| The ID of the List to unpin |

### Return type

[**ListPinnedResponse**](ListPinnedResponse.md)

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

<a name="userFollowedLists"></a>
# **userFollowedLists**
> MultiListResponse userFollowedLists(idmaxResultspaginationTokenlistFieldsexpansionsuserFields)

Get User&#39;s Followed Lists

Returns a user&#39;s followed Lists.

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

import com.twitter.clientlib.api.ListsApi;
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
    Integer maxResults = 100; // Integer | The maximum number of results
    Long paginationToken = 56L; // Long | This parameter is used to get a specified 'page' of results.
    Set<String> listFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of List fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    try {
           MultiListResponse result = apiInstance.lists().userFollowedLists(id, maxResults, paginationToken, listFields, expansions, userFields);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the user for whom to return results |
 **maxResults** | **Integer**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **listFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiListResponse**](MultiListResponse.md)

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

