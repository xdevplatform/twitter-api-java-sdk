# ComplianceApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBatchComplianceJob**](ComplianceApi.md#createBatchComplianceJob) | **POST** /2/compliance/jobs | Create compliance job |
| [**getBatchComplianceJob**](ComplianceApi.md#getBatchComplianceJob) | **GET** /2/compliance/jobs/{id} | Get compliance job |
| [**listBatchComplianceJobs**](ComplianceApi.md#listBatchComplianceJobs) | **GET** /2/compliance/jobs | List compliance jobs |


<a name="createBatchComplianceJob"></a>
# **createBatchComplianceJob**
> SingleComplianceJobResponse createBatchComplianceJob(createBatchComplianceJobRequest)

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
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    CreateBatchComplianceJobRequest createBatchComplianceJobRequest = new CreateBatchComplianceJobRequest(); // CreateBatchComplianceJobRequest | 
    try {
           SingleComplianceJobResponse result = apiInstance.compliance().createBatchComplianceJob(createBatchComplianceJobRequest);
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
| **createBatchComplianceJobRequest** | [**CreateBatchComplianceJobRequest**](CreateBatchComplianceJobRequest.md)|  | |

### Return type

[**SingleComplianceJobResponse**](SingleComplianceJobResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful |  -  |
| **0** | The request has failed. |  -  |

<a name="getBatchComplianceJob"></a>
# **getBatchComplianceJob**
> SingleComplianceJobResponse getBatchComplianceJob(id)

Get compliance job

Returns a single compliance job by ID

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
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    String id = "id_example"; // String | ID of the compliance job to retrieve.
    try {
           SingleComplianceJobResponse result = apiInstance.compliance().getBatchComplianceJob(id);
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
| **id** | **String**| ID of the compliance job to retrieve. | |

### Return type

[**SingleComplianceJobResponse**](SingleComplianceJobResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful |  -  |
| **0** | The request has failed. |  -  |

<a name="listBatchComplianceJobs"></a>
# **listBatchComplianceJobs**
> MultiComplianceJobResponse listBatchComplianceJobs(type, status)

List compliance jobs

Returns recent compliance jobs for a given job type and optional job status

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
    TwitterCredentialsBearer credentials = new TwitterCredentialsBearer(System.getenv("TWITTER_BEARER_TOKEN"));
    TwitterApi apiInstance = new TwitterApi();
    apiInstance.setTwitterCredentials(credentials);
    // Set the params values
    ComplianceJobType type = ComplianceJobType.fromValue("tweets"); // ComplianceJobType | Type of compliance job to list.
    ComplianceJobStatus status = ComplianceJobStatus.fromValue("created"); // ComplianceJobStatus | Status of compliance job to list.
    try {
           MultiComplianceJobResponse result = apiInstance.compliance().listBatchComplianceJobs(type, status);
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
| **type** | [**ComplianceJobType**](.md)| Type of compliance job to list. | [enum: tweets, users] |
| **status** | [**ComplianceJobStatus**](.md)| Status of compliance job to list. | [optional] [enum: created, in_progress, failed, complete] |

### Return type

[**MultiComplianceJobResponse**](MultiComplianceJobResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List compliance jobs response |  -  |
| **0** | The request has failed. |  -  |

