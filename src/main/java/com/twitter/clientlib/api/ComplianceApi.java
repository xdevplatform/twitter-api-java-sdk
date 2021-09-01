/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.api;

import com.twitter.clientlib.ApiCallback;
import com.twitter.clientlib.ApiClient;
import com.twitter.clientlib.auth.*;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.ApiResponse;
import com.twitter.clientlib.Configuration;
import com.twitter.clientlib.Pair;
import com.twitter.clientlib.ProgressRequestBody;
import com.twitter.clientlib.ProgressResponseBody;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.twitter.clientlib.model.ComplianceJobStatus;
import com.twitter.clientlib.model.ComplianceJobType;
import com.twitter.clientlib.model.CreateBatchComplianceJobRequest;
import com.twitter.clientlib.model.Error;
import com.twitter.clientlib.model.MultiComplianceJobResponse;
import com.twitter.clientlib.model.Problem;
import com.twitter.clientlib.model.SingleComplianceJobResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.io.InputStream;
import javax.ws.rs.core.GenericType;

import org.apache.commons.lang3.StringUtils;

public class ComplianceApi extends ApiCommon {

    /**
     * Build call for createBatchComplianceJob
     * @param createBatchComplianceJobRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createBatchComplianceJobCall(CreateBatchComplianceJobRequest createBatchComplianceJobRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createBatchComplianceJobRequest;

        // create path and map variables
        String localVarPath = "/2/compliance/jobs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, reduceAuthNames(localVarAuthNames), _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createBatchComplianceJobValidateBeforeCall(CreateBatchComplianceJobRequest createBatchComplianceJobRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'createBatchComplianceJobRequest' is set
        if (createBatchComplianceJobRequest == null) {
            throw new ApiException("Missing the required parameter 'createBatchComplianceJobRequest' when calling createBatchComplianceJob(Async)");
        }
        

        okhttp3.Call localVarCall = createBatchComplianceJobCall(createBatchComplianceJobRequest, _callback);
        return localVarCall;

    }

    /**
     * Create compliance job
     * Creates a compliance for the given job type
     * @param createBatchComplianceJobRequest  (required)
     * @return SingleComplianceJobResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public SingleComplianceJobResponse createBatchComplianceJob(CreateBatchComplianceJobRequest createBatchComplianceJobRequest) throws ApiException {
        ApiResponse<SingleComplianceJobResponse> localVarResp;
        try{
          localVarResp = createBatchComplianceJobWithHttpInfo(createBatchComplianceJobRequest);
        } catch (ApiException e) {
          if (isOAUth2AutoRefreshToken() && e.getCode() == 401) {
            refreshToken();
            localVarResp = createBatchComplianceJobWithHttpInfo(createBatchComplianceJobRequest);
          } else {
            throw e;
          }
        }
        return localVarResp != null ? localVarResp.getData() : null;
    }

    /**
     * Create compliance job
     * Creates a compliance for the given job type
     * @param createBatchComplianceJobRequest  (required)
     * @return ApiResponse&lt;SingleComplianceJobResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SingleComplianceJobResponse> createBatchComplianceJobWithHttpInfo(CreateBatchComplianceJobRequest createBatchComplianceJobRequest) throws ApiException {
        okhttp3.Call localVarCall = createBatchComplianceJobValidateBeforeCall(createBatchComplianceJobRequest, null);
        try {
            Type localVarReturnType = new TypeToken<SingleComplianceJobResponse>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<com.twitter.clientlib.model.ProblemOrError>(){}.getType()));
            e.setErrorObjectType(new GenericType<com.twitter.clientlib.model.ProblemOrError>(){});
            throw e;
        }
    }

    /**
     * Create compliance job (asynchronously)
     * Creates a compliance for the given job type
     * @param createBatchComplianceJobRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createBatchComplianceJobAsync(CreateBatchComplianceJobRequest createBatchComplianceJobRequest, final ApiCallback<SingleComplianceJobResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createBatchComplianceJobValidateBeforeCall(createBatchComplianceJobRequest, _callback);
        Type localVarReturnType = new TypeToken<SingleComplianceJobResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getBatchComplianceJob
     * @param id ID of the compliance job to retrieve. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBatchComplianceJobCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2/compliance/jobs/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, reduceAuthNames(localVarAuthNames), _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBatchComplianceJobValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getBatchComplianceJob(Async)");
        }
        

        okhttp3.Call localVarCall = getBatchComplianceJobCall(id, _callback);
        return localVarCall;

    }

    /**
     * Get compliance job
     * Returns a single compliance job by ID
     * @param id ID of the compliance job to retrieve. (required)
     * @return SingleComplianceJobResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public SingleComplianceJobResponse getBatchComplianceJob(String id) throws ApiException {
        ApiResponse<SingleComplianceJobResponse> localVarResp;
        try{
          localVarResp = getBatchComplianceJobWithHttpInfo(id);
        } catch (ApiException e) {
          if (isOAUth2AutoRefreshToken() && e.getCode() == 401) {
            refreshToken();
            localVarResp = getBatchComplianceJobWithHttpInfo(id);
          } else {
            throw e;
          }
        }
        return localVarResp != null ? localVarResp.getData() : null;
    }

    /**
     * Get compliance job
     * Returns a single compliance job by ID
     * @param id ID of the compliance job to retrieve. (required)
     * @return ApiResponse&lt;SingleComplianceJobResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SingleComplianceJobResponse> getBatchComplianceJobWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getBatchComplianceJobValidateBeforeCall(id, null);
        try {
            Type localVarReturnType = new TypeToken<SingleComplianceJobResponse>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<com.twitter.clientlib.model.ProblemOrError>(){}.getType()));
            e.setErrorObjectType(new GenericType<com.twitter.clientlib.model.ProblemOrError>(){});
            throw e;
        }
    }

    /**
     * Get compliance job (asynchronously)
     * Returns a single compliance job by ID
     * @param id ID of the compliance job to retrieve. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBatchComplianceJobAsync(String id, final ApiCallback<SingleComplianceJobResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBatchComplianceJobValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<SingleComplianceJobResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listBatchComplianceJobs
     * @param type Type of compliance job to list. (required)
     * @param status Status of compliance job to list. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List compliance jobs response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listBatchComplianceJobsCall(ComplianceJobType type, ComplianceJobStatus status, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2/compliance/jobs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        final String[] localVarAccepts = {
            "application/json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, reduceAuthNames(localVarAuthNames), _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listBatchComplianceJobsValidateBeforeCall(ComplianceJobType type, ComplianceJobStatus status, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling listBatchComplianceJobs(Async)");
        }
        

        okhttp3.Call localVarCall = listBatchComplianceJobsCall(type, status, _callback);
        return localVarCall;

    }

    /**
     * List compliance jobs
     * Returns recent compliance jobs for a given job type and optional job status
     * @param type Type of compliance job to list. (required)
     * @param status Status of compliance job to list. (optional)
     * @return MultiComplianceJobResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List compliance jobs response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public MultiComplianceJobResponse listBatchComplianceJobs(ComplianceJobType type, ComplianceJobStatus status) throws ApiException {
        ApiResponse<MultiComplianceJobResponse> localVarResp;
        try{
          localVarResp = listBatchComplianceJobsWithHttpInfo(type, status);
        } catch (ApiException e) {
          if (isOAUth2AutoRefreshToken() && e.getCode() == 401) {
            refreshToken();
            localVarResp = listBatchComplianceJobsWithHttpInfo(type, status);
          } else {
            throw e;
          }
        }
        return localVarResp != null ? localVarResp.getData() : null;
    }

    /**
     * List compliance jobs
     * Returns recent compliance jobs for a given job type and optional job status
     * @param type Type of compliance job to list. (required)
     * @param status Status of compliance job to list. (optional)
     * @return ApiResponse&lt;MultiComplianceJobResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List compliance jobs response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MultiComplianceJobResponse> listBatchComplianceJobsWithHttpInfo(ComplianceJobType type, ComplianceJobStatus status) throws ApiException {
        okhttp3.Call localVarCall = listBatchComplianceJobsValidateBeforeCall(type, status, null);
        try {
            Type localVarReturnType = new TypeToken<MultiComplianceJobResponse>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<com.twitter.clientlib.model.ProblemOrError>(){}.getType()));
            e.setErrorObjectType(new GenericType<com.twitter.clientlib.model.ProblemOrError>(){});
            throw e;
        }
    }

    /**
     * List compliance jobs (asynchronously)
     * Returns recent compliance jobs for a given job type and optional job status
     * @param type Type of compliance job to list. (required)
     * @param status Status of compliance job to list. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List compliance jobs response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listBatchComplianceJobsAsync(ComplianceJobType type, ComplianceJobStatus status, final ApiCallback<MultiComplianceJobResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listBatchComplianceJobsValidateBeforeCall(type, status, _callback);
        Type localVarReturnType = new TypeToken<MultiComplianceJobResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
