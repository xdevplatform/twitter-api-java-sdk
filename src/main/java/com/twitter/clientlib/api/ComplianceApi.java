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


import com.twitter.clientlib.model.CreateComplianceJobRequest;
import com.twitter.clientlib.model.CreateComplianceJobResponse;
import com.twitter.clientlib.model.Error;
import com.twitter.clientlib.model.Get2ComplianceJobsIdResponse;
import com.twitter.clientlib.model.Get2ComplianceJobsResponse;
import com.twitter.clientlib.model.Problem;
import java.util.Set;

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

    private okhttp3.Call createBatchComplianceJobCall(CreateComplianceJobRequest createComplianceJobRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createComplianceJobRequest;

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, reduceAuthNames(localVarAuthNames), _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createBatchComplianceJobValidateBeforeCall(CreateComplianceJobRequest createComplianceJobRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'createComplianceJobRequest' is set
        if (createComplianceJobRequest == null) {
            throw new ApiException("Missing the required parameter 'createComplianceJobRequest' when calling createBatchComplianceJob(Async)");
        }
        

        okhttp3.Call localVarCall = createBatchComplianceJobCall(createComplianceJobRequest, _callback);
        return localVarCall;

    }


    private ApiResponse<CreateComplianceJobResponse> createBatchComplianceJobWithHttpInfo(CreateComplianceJobRequest createComplianceJobRequest) throws ApiException {
        okhttp3.Call localVarCall = createBatchComplianceJobValidateBeforeCall(createComplianceJobRequest, null);
        try {
            Type localVarReturnType = new TypeToken<CreateComplianceJobResponse>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<com.twitter.clientlib.model.ProblemOrError>(){}.getType()));
            throw e;
        }
    }

    private okhttp3.Call createBatchComplianceJobAsync(CreateComplianceJobRequest createComplianceJobRequest, final ApiCallback<CreateComplianceJobResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createBatchComplianceJobValidateBeforeCall(createComplianceJobRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateComplianceJobResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateBatchComplianceJobRequest {
        private final CreateComplianceJobRequest createComplianceJobRequest;

        private APIcreateBatchComplianceJobRequest(CreateComplianceJobRequest createComplianceJobRequest) {
            this.createComplianceJobRequest = createComplianceJobRequest;
        }

        /**
         * Build call for createBatchComplianceJob
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return createBatchComplianceJobCall(createComplianceJobRequest, _callback);
        }

        /**
         * Execute createBatchComplianceJob request
         * @return CreateComplianceJobResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public CreateComplianceJobResponse execute() throws ApiException {
            ApiResponse<CreateComplianceJobResponse> localVarResp = createBatchComplianceJobWithHttpInfo(createComplianceJobRequest);
            return localVarResp.getData();
        }
        /**
        * Calls the API using a retry mechanism to handle rate limits errors.
        *
        */
        public CreateComplianceJobResponse  execute(Integer retries) throws ApiException {
          CreateComplianceJobResponse localVarResp;
            try{
          localVarResp = execute();
          } catch (ApiException e) {
            if(handleRateLimit(e, retries)) {
              return execute(retries - 1);
            } else {
              throw e;
            }
          }
          return localVarResp;
        }
        /**
         * Execute createBatchComplianceJob request with HTTP info returned
         * @return ApiResponse&lt;CreateComplianceJobResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */

            public ApiResponse<CreateComplianceJobResponse> executeWithHttpInfo() throws ApiException {
              return createBatchComplianceJobWithHttpInfo(createComplianceJobRequest);
            }
        /**
         * Execute createBatchComplianceJob request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CreateComplianceJobResponse> _callback) throws ApiException {
            return createBatchComplianceJobAsync(createComplianceJobRequest, _callback);
        }
    }

    /**
     * Create compliance job
     * Creates a compliance for the given job type
     * @param createComplianceJobRequest  (required)
     * @return APIcreateBatchComplianceJobRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public APIcreateBatchComplianceJobRequest createBatchComplianceJob(CreateComplianceJobRequest createComplianceJobRequest) {
        return new APIcreateBatchComplianceJobRequest(createComplianceJobRequest);
    }
    private okhttp3.Call getBatchComplianceJobCall(String id, Set<String> complianceJobFields, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/2/compliance/jobs/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (complianceJobFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "compliance_job.fields", complianceJobFields));
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, reduceAuthNames(localVarAuthNames), _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBatchComplianceJobValidateBeforeCall(String id, Set<String> complianceJobFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getBatchComplianceJob(Async)");
        }
        

        okhttp3.Call localVarCall = getBatchComplianceJobCall(id, complianceJobFields, _callback);
        return localVarCall;

    }


    private ApiResponse<Get2ComplianceJobsIdResponse> getBatchComplianceJobWithHttpInfo(String id, Set<String> complianceJobFields) throws ApiException {
        okhttp3.Call localVarCall = getBatchComplianceJobValidateBeforeCall(id, complianceJobFields, null);
        try {
            Type localVarReturnType = new TypeToken<Get2ComplianceJobsIdResponse>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<com.twitter.clientlib.model.ProblemOrError>(){}.getType()));
            throw e;
        }
    }

    private okhttp3.Call getBatchComplianceJobAsync(String id, Set<String> complianceJobFields, final ApiCallback<Get2ComplianceJobsIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBatchComplianceJobValidateBeforeCall(id, complianceJobFields, _callback);
        Type localVarReturnType = new TypeToken<Get2ComplianceJobsIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetBatchComplianceJobRequest {
        private final String id;
        private Set<String> complianceJobFields;

        private APIgetBatchComplianceJobRequest(String id) {
            this.id = id;
        }

        /**
         * Set complianceJobFields
         * @param complianceJobFields A comma separated list of ComplianceJob fields to display. (optional)
         * @return APIgetBatchComplianceJobRequest
         */
        public APIgetBatchComplianceJobRequest complianceJobFields(Set<String> complianceJobFields) {
            this.complianceJobFields = complianceJobFields;
            return this;
        }

        /**
         * Build call for getBatchComplianceJob
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getBatchComplianceJobCall(id, complianceJobFields, _callback);
        }

        /**
         * Execute getBatchComplianceJob request
         * @return Get2ComplianceJobsIdResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public Get2ComplianceJobsIdResponse execute() throws ApiException {
            ApiResponse<Get2ComplianceJobsIdResponse> localVarResp = getBatchComplianceJobWithHttpInfo(id, complianceJobFields);
            return localVarResp.getData();
        }
        /**
        * Calls the API using a retry mechanism to handle rate limits errors.
        *
        */
        public Get2ComplianceJobsIdResponse  execute(Integer retries) throws ApiException {
          Get2ComplianceJobsIdResponse localVarResp;
            try{
          localVarResp = execute();
          } catch (ApiException e) {
            if(handleRateLimit(e, retries)) {
              return execute(retries - 1);
            } else {
              throw e;
            }
          }
          return localVarResp;
        }
        /**
         * Execute getBatchComplianceJob request with HTTP info returned
         * @return ApiResponse&lt;Get2ComplianceJobsIdResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */

            public ApiResponse<Get2ComplianceJobsIdResponse> executeWithHttpInfo() throws ApiException {
              return getBatchComplianceJobWithHttpInfo(id, complianceJobFields);
            }
        /**
         * Execute getBatchComplianceJob request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Get2ComplianceJobsIdResponse> _callback) throws ApiException {
            return getBatchComplianceJobAsync(id, complianceJobFields, _callback);
        }
    }

    /**
     * Get Compliance Job
     * Returns a single Compliance Job by ID
     * @param id The ID of the Compliance Job to retrieve. (required)
     * @return APIgetBatchComplianceJobRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public APIgetBatchComplianceJobRequest getBatchComplianceJob(String id) {
        return new APIgetBatchComplianceJobRequest(id);
    }
    private okhttp3.Call listBatchComplianceJobsCall(String type, String status, Set<String> complianceJobFields, final ApiCallback _callback) throws ApiException {
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

        if (complianceJobFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "compliance_job.fields", complianceJobFields));
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, reduceAuthNames(localVarAuthNames), _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listBatchComplianceJobsValidateBeforeCall(String type, String status, Set<String> complianceJobFields, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling listBatchComplianceJobs(Async)");
        }
        

        okhttp3.Call localVarCall = listBatchComplianceJobsCall(type, status, complianceJobFields, _callback);
        return localVarCall;

    }


    private ApiResponse<Get2ComplianceJobsResponse> listBatchComplianceJobsWithHttpInfo(String type, String status, Set<String> complianceJobFields) throws ApiException {
        okhttp3.Call localVarCall = listBatchComplianceJobsValidateBeforeCall(type, status, complianceJobFields, null);
        try {
            Type localVarReturnType = new TypeToken<Get2ComplianceJobsResponse>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<com.twitter.clientlib.model.ProblemOrError>(){}.getType()));
            throw e;
        }
    }

    private okhttp3.Call listBatchComplianceJobsAsync(String type, String status, Set<String> complianceJobFields, final ApiCallback<Get2ComplianceJobsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listBatchComplianceJobsValidateBeforeCall(type, status, complianceJobFields, _callback);
        Type localVarReturnType = new TypeToken<Get2ComplianceJobsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistBatchComplianceJobsRequest {
        private final String type;
        private String status;
        private Set<String> complianceJobFields;

        private APIlistBatchComplianceJobsRequest(String type) {
            this.type = type;
        }

        /**
         * Set status
         * @param status Status of Compliance Job to list. (optional)
         * @return APIlistBatchComplianceJobsRequest
         */
        public APIlistBatchComplianceJobsRequest status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Set complianceJobFields
         * @param complianceJobFields A comma separated list of ComplianceJob fields to display. (optional)
         * @return APIlistBatchComplianceJobsRequest
         */
        public APIlistBatchComplianceJobsRequest complianceJobFields(Set<String> complianceJobFields) {
            this.complianceJobFields = complianceJobFields;
            return this;
        }

        /**
         * Build call for listBatchComplianceJobs
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listBatchComplianceJobsCall(type, status, complianceJobFields, _callback);
        }

        /**
         * Execute listBatchComplianceJobs request
         * @return Get2ComplianceJobsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public Get2ComplianceJobsResponse execute() throws ApiException {
            ApiResponse<Get2ComplianceJobsResponse> localVarResp = listBatchComplianceJobsWithHttpInfo(type, status, complianceJobFields);
            return localVarResp.getData();
        }
        /**
        * Calls the API using a retry mechanism to handle rate limits errors.
        *
        */
        public Get2ComplianceJobsResponse  execute(Integer retries) throws ApiException {
          Get2ComplianceJobsResponse localVarResp;
            try{
          localVarResp = execute();
          } catch (ApiException e) {
            if(handleRateLimit(e, retries)) {
              return execute(retries - 1);
            } else {
              throw e;
            }
          }
          return localVarResp;
        }
        /**
         * Execute listBatchComplianceJobs request with HTTP info returned
         * @return ApiResponse&lt;Get2ComplianceJobsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */

            public ApiResponse<Get2ComplianceJobsResponse> executeWithHttpInfo() throws ApiException {
              return listBatchComplianceJobsWithHttpInfo(type, status, complianceJobFields);
            }
        /**
         * Execute listBatchComplianceJobs request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Get2ComplianceJobsResponse> _callback) throws ApiException {
            return listBatchComplianceJobsAsync(type, status, complianceJobFields, _callback);
        }
    }

    /**
     * List Compliance Jobs
     * Returns recent Compliance Jobs for a given job type and optional job status
     * @param type Type of Compliance Job to list. (required)
     * @return APIlistBatchComplianceJobsRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request has succeeded. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> The request has failed. </td><td>  -  </td></tr>
     </table>
     */
    public APIlistBatchComplianceJobsRequest listBatchComplianceJobs(String type) {
        return new APIlistBatchComplianceJobsRequest(type);
    }
}
