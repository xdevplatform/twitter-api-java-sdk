# ComplianceApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBatchComplianceJob**](ComplianceApi.md#createBatchComplianceJob) | **POST** /2/compliance/jobs | Create compliance job |
| [**getBatchComplianceJob**](ComplianceApi.md#getBatchComplianceJob) | **GET** /2/compliance/jobs/{id} | Get Compliance Job |
| [**getTweetsComplianceStream**](ComplianceApi.md#getTweetsComplianceStream) | **GET** /2/tweets/compliance/stream | Tweets Compliance stream |
| [**getUsersComplianceStream**](ComplianceApi.md#getUsersComplianceStream) | **GET** /2/users/compliance/stream | Users Compliance stream |
| [**listBatchComplianceJobs**](ComplianceApi.md#listBatchComplianceJobs) | **GET** /2/compliance/jobs | List Compliance Jobs |


<a name="createBatchComplianceJob"></a>
# **createBatchComplianceJob**
> CreateComplianceJobResponse createBatchComplianceJob(createComplianceJobRequest).execute();

Create compliance job

Creates a compliance for the given job type

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

import com.twitter.clientlib.api.ComplianceApi;
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
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
        TwitterApi apiInstance = new TwitterApi(credentials);

    // Set the params values
    CreateComplianceJobRequest createComplianceJobRequest = new CreateComplianceJobRequest(); // CreateComplianceJobRequest | 
    try {
           CreateComplianceJobResponse result = apiInstance.compliance().createBatchComplianceJob(createComplianceJobRequest)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#createBatchComplianceJob");
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
| **createComplianceJobRequest** | [**CreateComplianceJobRequest**](CreateComplianceJobRequest.md)|  | |

### Return type

[**CreateComplianceJobResponse**](CreateComplianceJobResponse.md)

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

<a name="getBatchComplianceJob"></a>
# **getBatchComplianceJob**
> Get2ComplianceJobsIdResponse getBatchComplianceJob(id).complianceJobFields(complianceJobFields).execute();

Get Compliance Job

Returns a single Compliance Job by ID

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

import com.twitter.clientlib.api.ComplianceApi;
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
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
        TwitterApi apiInstance = new TwitterApi(credentials);

    // Set the params values
    String id = "id_example"; // String | The ID of the Compliance Job to retrieve.
    Set<String> complianceJobFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of ComplianceJob fields to display.
    try {
           Get2ComplianceJobsIdResponse result = apiInstance.compliance().getBatchComplianceJob(id)
            .complianceJobFields(complianceJobFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#getBatchComplianceJob");
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
| **id** | **String**| The ID of the Compliance Job to retrieve. | |
| **complianceJobFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of ComplianceJob fields to display. | [optional] [enum: created_at, download_expires_at, download_url, id, name, resumable, status, type, upload_expires_at, upload_url] |

### Return type

[**Get2ComplianceJobsIdResponse**](Get2ComplianceJobsIdResponse.md)

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

<a name="getTweetsComplianceStream"></a>
# **getTweetsComplianceStream**
> TweetComplianceStreamResponse getTweetsComplianceStream(partition).backfillMinutes(backfillMinutes).startTime(startTime).endTime(endTime).execute();

Tweets Compliance stream

Streams 100% of compliance data for Tweets

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

import com.twitter.clientlib.api.ComplianceApi;
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
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
        TwitterApi apiInstance = new TwitterApi(credentials);

    // Set the params values
    Integer backfillMinutes = 56; // Integer | The number of minutes of backfill requested.
    Integer partition = 56; // Integer | The partition number.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweet Compliance events will be provided.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-14T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweet Compliance events will be provided.
    try {
            InputStream result = apiInstance.compliance().getTweetsComplianceStream(partition)
             .backfillMinutes(backfillMinutes)
             .startTime(startTime)
             .endTime(endTime)
                .execute();
            try{
               JSON json = new JSON();
               Type localVarReturnType = new TypeToken<TweetComplianceStreamResponse>(){}.getType();
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
      System.err.println("Exception when calling ComplianceApi#getTweetsComplianceStream");
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
| **partition** | **Integer**| The partition number. | |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweet Compliance events will be provided. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweet Compliance events will be provided. | [optional] |

### Return type

[**TweetComplianceStreamResponse**](TweetComplianceStreamResponse.md)

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

<a name="getUsersComplianceStream"></a>
# **getUsersComplianceStream**
> UserComplianceStreamResponse getUsersComplianceStream(partition).backfillMinutes(backfillMinutes).startTime(startTime).endTime(endTime).execute();

Users Compliance stream

Streams 100% of compliance data for Users

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

import com.twitter.clientlib.api.ComplianceApi;
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
    // Set the credentials based on the API's "security" tag values.
    // Check the API definition in https://api.twitter.com/2/openapi.json
    // When multiple options exist, the SDK supports only "OAuth2UserToken" or "BearerToken"

    // Uncomment and set the credentials configuration
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
        TwitterApi apiInstance = new TwitterApi(credentials);

    // Set the params values
    Integer backfillMinutes = 56; // Integer | The number of minutes of backfill requested.
    Integer partition = 56; // Integer | The partition number.
    OffsetDateTime startTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the User Compliance events will be provided.
    OffsetDateTime endTime = OffsetDateTime.parse("2021-02-01T18:40:40.000Z"); // OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp from which the User Compliance events will be provided.
    try {
            InputStream result = apiInstance.compliance().getUsersComplianceStream(partition)
             .backfillMinutes(backfillMinutes)
             .startTime(startTime)
             .endTime(endTime)
                .execute();
            try{
               JSON json = new JSON();
               Type localVarReturnType = new TypeToken<UserComplianceStreamResponse>(){}.getType();
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
      System.err.println("Exception when calling ComplianceApi#getUsersComplianceStream");
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
| **partition** | **Integer**| The partition number. | |
| **startTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the User Compliance events will be provided. | [optional] |
| **endTime** | **OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp from which the User Compliance events will be provided. | [optional] |

### Return type

[**UserComplianceStreamResponse**](UserComplianceStreamResponse.md)

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

<a name="listBatchComplianceJobs"></a>
# **listBatchComplianceJobs**
> Get2ComplianceJobsResponse listBatchComplianceJobs(type).status(status).complianceJobFields(complianceJobFields).execute();

List Compliance Jobs

Returns recent Compliance Jobs for a given job type and optional job status

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

import com.twitter.clientlib.api.ComplianceApi;
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
      
    // Configure HTTP bearer authorization:
    // TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
        TwitterApi apiInstance = new TwitterApi(credentials);

    // Set the params values
    String type = "tweets"; // String | Type of Compliance Job to list.
    String status = "created"; // String | Status of Compliance Job to list.
    Set<String> complianceJobFields = new HashSet<>(Arrays.asList()); // Set<String> | A comma separated list of ComplianceJob fields to display.
    try {
           Get2ComplianceJobsResponse result = apiInstance.compliance().listBatchComplianceJobs(type)
            .status(status)
            .complianceJobFields(complianceJobFields)
            .execute();
            System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ComplianceApi#listBatchComplianceJobs");
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
| **type** | **String**| Type of Compliance Job to list. | [enum: tweets, users] |
| **status** | **String**| Status of Compliance Job to list. | [optional] [enum: created, in_progress, failed, complete] |
| **complianceJobFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of ComplianceJob fields to display. | [optional] [enum: created_at, download_expires_at, download_url, id, name, resumable, status, type, upload_expires_at, upload_url] |

### Return type

[**Get2ComplianceJobsResponse**](Get2ComplianceJobsResponse.md)

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

