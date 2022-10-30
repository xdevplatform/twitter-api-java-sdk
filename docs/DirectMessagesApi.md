# DirectMessagesApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dmConversationByIdEventIdCreate**](DirectMessagesApi.md#dmConversationByIdEventIdCreate) | **POST** /2/dm_conversations/{dm_conversation_id}/messages | Send a new message to a DM Conversation |
| [**dmConversationIdCreate**](DirectMessagesApi.md#dmConversationIdCreate) | **POST** /2/dm_conversations | Create a new DM Conversation |
| [**dmConversationWithUserEventIdCreate**](DirectMessagesApi.md#dmConversationWithUserEventIdCreate) | **POST** /2/dm_conversations/with/{participant_id}/messages | Send a new message to a user |
| [**getDmConversationsIdDmEvents**](DirectMessagesApi.md#getDmConversationsIdDmEvents) | **GET** /2/dm_conversations/{id}/dm_events | Get DM Events for a DM Conversation |
| [**getDmConversationsWithParticipantIdDmEvents**](DirectMessagesApi.md#getDmConversationsWithParticipantIdDmEvents) | **GET** /2/dm_conversations/with/{participant_id}/dm_events | Get DM Events for a DM Conversation |
| [**getDmEvents**](DirectMessagesApi.md#getDmEvents) | **GET** /2/dm_events | Get recent DM Events |


<a name="dmConversationByIdEventIdCreate"></a>
# **dmConversationByIdEventIdCreate**
> CreateDmEventResponse dmConversationByIdEventIdCreate(dmConversationId).createMessageRequest(createMessageRequest).execute();

Send a new message to a DM Conversation

Creates a new message for a DM Conversation specified by DM Conversation ID

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

import com.twitter.clientlib.api.DirectMessagesApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    TwitterApi apiInstance = new TwitterApi(credentials);

    // Set the params values
    CreateMessageRequest createMessageRequest = new CreateMessageRequest(); // CreateMessageRequest | 
    String dmConversationId = "dmConversationId_example"; // String | The DM Conversation ID.
    try {
           CreateDmEventResponse result = apiInstance.directMessages().dmConversationByIdEventIdCreate(dmConversationId)
            .createMessageRequest(createMessageRequest)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#dmConversationByIdEventIdCreate");
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
| **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md)|  | [optional] |
| **dmConversationId** | **String**| The DM Conversation ID. | |

### Return type

[**CreateDmEventResponse**](CreateDmEventResponse.md)

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

<a name="dmConversationIdCreate"></a>
# **dmConversationIdCreate**
> CreateDmEventResponse dmConversationIdCreate().createDmConversationRequest(createDmConversationRequest).execute();

Create a new DM Conversation

Creates a new DM Conversation.

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

import com.twitter.clientlib.api.DirectMessagesApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    TwitterApi apiInstance = new TwitterApi(credentials);

    // Set the params values
    CreateDmConversationRequest createDmConversationRequest = new CreateDmConversationRequest(); // CreateDmConversationRequest | 
    try {
           CreateDmEventResponse result = apiInstance.directMessages().dmConversationIdCreate()
            .createDmConversationRequest(createDmConversationRequest)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#dmConversationIdCreate");
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
| **createDmConversationRequest** | [**CreateDmConversationRequest**](CreateDmConversationRequest.md)|  | [optional] |

### Return type

[**CreateDmEventResponse**](CreateDmEventResponse.md)

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

<a name="dmConversationWithUserEventIdCreate"></a>
# **dmConversationWithUserEventIdCreate**
> CreateDmEventResponse dmConversationWithUserEventIdCreate(participantId).createMessageRequest(createMessageRequest).execute();

Send a new message to a user

Creates a new message for a DM Conversation with a participant user by ID

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

import com.twitter.clientlib.api.DirectMessagesApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    TwitterApi apiInstance = new TwitterApi(credentials);

    // Set the params values
    CreateMessageRequest createMessageRequest = new CreateMessageRequest(); // CreateMessageRequest | 
    String participantId = "participantId_example"; // String | The ID of the recipient user that will receive the DM.
    try {
           CreateDmEventResponse result = apiInstance.directMessages().dmConversationWithUserEventIdCreate(participantId)
            .createMessageRequest(createMessageRequest)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#dmConversationWithUserEventIdCreate");
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
| **createMessageRequest** | [**CreateMessageRequest**](CreateMessageRequest.md)|  | [optional] |
| **participantId** | **String**| The ID of the recipient user that will receive the DM. | |

### Return type

[**CreateDmEventResponse**](CreateDmEventResponse.md)

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

<a name="getDmConversationsIdDmEvents"></a>
# **getDmConversationsIdDmEvents**
> Get2DmConversationsIdDmEventsResponse getDmConversationsIdDmEvents(id).maxResults(maxResults).paginationToken(paginationToken).eventTypes(eventTypes).dmEventFields(dmEventFields).expansions(expansions).mediaFields(mediaFields).userFields(userFields).tweetFields(tweetFields).execute();

Get DM Events for a DM Conversation

Returns DM Events for a DM Conversation

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

import com.twitter.clientlib.api.DirectMessagesApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    TwitterApi apiInstance = new TwitterApi(credentials);

    // Set the params values
    String id = "id_example"; // String | The DM Conversation ID.
    Integer maxResults = 100; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Set<String> eventTypes = new HashSet<>(Arrays.asList()); // Set<String> | The set of event_types to include in the results.
    Set<String> dmEventFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of DmEvent fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2DmConversationsIdDmEventsResponse result = apiInstance.directMessages().getDmConversationsIdDmEvents(id)
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .eventTypes(eventTypes)
            .dmEventFields(dmEventFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .userFields(userFields)
            .tweetFields(tweetFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#getDmConversationsIdDmEvents");
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
| **id** | **String**| The DM Conversation ID. | |
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| The set of event_types to include in the results. | [optional] [enum: MessageCreate, ParticipantsJoin, ParticipantsLeave] |
| **dmEventFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of DmEvent fields to display. | [optional] [enum: attachments, created_at, dm_conversation_id, event_type, id, participant_ids, referenced_tweets, sender_id, text] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, participant_ids, referenced_tweets.id, sender_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2DmConversationsIdDmEventsResponse**](Get2DmConversationsIdDmEventsResponse.md)

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

<a name="getDmConversationsWithParticipantIdDmEvents"></a>
# **getDmConversationsWithParticipantIdDmEvents**
> Get2DmConversationsWithParticipantIdDmEventsResponse getDmConversationsWithParticipantIdDmEvents(participantId).maxResults(maxResults).paginationToken(paginationToken).eventTypes(eventTypes).dmEventFields(dmEventFields).expansions(expansions).mediaFields(mediaFields).userFields(userFields).tweetFields(tweetFields).execute();

Get DM Events for a DM Conversation

Returns DM Events for a DM Conversation

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

import com.twitter.clientlib.api.DirectMessagesApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    TwitterApi apiInstance = new TwitterApi(credentials);

    // Set the params values
    String participantId = "participantId_example"; // String | The ID of the participant user for the One to One DM conversation.
    Integer maxResults = 100; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Set<String> eventTypes = new HashSet<>(Arrays.asList()); // Set<String> | The set of event_types to include in the results.
    Set<String> dmEventFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of DmEvent fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2DmConversationsWithParticipantIdDmEventsResponse result = apiInstance.directMessages().getDmConversationsWithParticipantIdDmEvents(participantId)
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .eventTypes(eventTypes)
            .dmEventFields(dmEventFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .userFields(userFields)
            .tweetFields(tweetFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#getDmConversationsWithParticipantIdDmEvents");
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
| **participantId** | **String**| The ID of the participant user for the One to One DM conversation. | |
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| The set of event_types to include in the results. | [optional] [enum: MessageCreate, ParticipantsJoin, ParticipantsLeave] |
| **dmEventFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of DmEvent fields to display. | [optional] [enum: attachments, created_at, dm_conversation_id, event_type, id, participant_ids, referenced_tweets, sender_id, text] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, participant_ids, referenced_tweets.id, sender_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2DmConversationsWithParticipantIdDmEventsResponse**](Get2DmConversationsWithParticipantIdDmEventsResponse.md)

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

<a name="getDmEvents"></a>
# **getDmEvents**
> Get2DmEventsResponse getDmEvents().maxResults(maxResults).paginationToken(paginationToken).eventTypes(eventTypes).dmEventFields(dmEventFields).expansions(expansions).mediaFields(mediaFields).userFields(userFields).tweetFields(tweetFields).execute();

Get recent DM Events

Returns recent DM Events across DM conversations

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

import com.twitter.clientlib.api.DirectMessagesApi;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure OAuth2 access token for authorization:
    // TwitterCredentialsOAuth2 credentials = new TwitterCredentialsOAuth2(System.getenv("TWITTER_OAUTH2_CLIENT_ID"),
    //     System.getenv("TWITTER_OAUTH2_CLIENT_SECRET"),
    //     System.getenv("TWITTER_OAUTH2_ACCESS_TOKEN"),
    //     System.getenv("TWITTER_OAUTH2_REFRESH_TOKEN"));
    TwitterApi apiInstance = new TwitterApi(credentials);

    // Set the params values
    Integer maxResults = 100; // Integer | The maximum number of results.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Set<String> eventTypes = new HashSet<>(Arrays.asList()); // Set<String> | The set of event_types to include in the results.
    Set<String> dmEventFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of DmEvent fields to display.
    Set<String> expansions = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Media fields to display.
    Set<String> userFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of User fields to display.
    Set<String> tweetFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of Tweet fields to display.
    try {
           Get2DmEventsResponse result = apiInstance.directMessages().getDmEvents()
            .maxResults(maxResults)
            .paginationToken(paginationToken)
            .eventTypes(eventTypes)
            .dmEventFields(dmEventFields)
            .expansions(expansions)
            .mediaFields(mediaFields)
            .userFields(userFields)
            .tweetFields(tweetFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DirectMessagesApi#getDmEvents");
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
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **eventTypes** | [**Set&lt;String&gt;**](String.md)| The set of event_types to include in the results. | [optional] [enum: MessageCreate, ParticipantsJoin, ParticipantsLeave] |
| **dmEventFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of DmEvent fields to display. | [optional] [enum: attachments, created_at, dm_conversation_id, event_type, id, participant_ids, referenced_tweets, sender_id, text] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, participant_ids, referenced_tweets.id, sender_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2DmEventsResponse**](Get2DmEventsResponse.md)

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

