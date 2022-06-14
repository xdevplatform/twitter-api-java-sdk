# ComplianceApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBatchComplianceJob**](ComplianceApi.md#createBatchComplianceJob) | **POST** /2/compliance/jobs | Create compliance job |
| [**getBatchComplianceJob**](ComplianceApi.md#getBatchComplianceJob) | **GET** /2/compliance/jobs/{id} | Get Compliance Job |
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

