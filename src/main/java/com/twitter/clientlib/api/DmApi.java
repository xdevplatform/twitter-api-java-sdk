package com.twitter.clientlib.api;

import com.google.gson.reflect.TypeToken;
import com.twitter.clientlib.ApiCallback;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.ApiResponse;
import com.twitter.clientlib.Pair;
import com.twitter.clientlib.model.DmEvent;
import com.twitter.clientlib.model.Get2DmEventsResponse;
import com.twitter.clientlib.model.ReplyToDmConversationResponse;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.*;

public class DmApi extends ApiCommon {

    public class APIfindDmEventsRequest {
        private Set<String> tweetFields;
        private Set<String> expansions;
        private Set<String> mediaFields;
        private Set<String> userFields;
        private Set<String> dmEventsFields;
        private Set<String> dmEventTypes;
        private Integer maxResults;
        private String paginationToken;
        private final Set<String> tweetFieldsAll = new HashSet<>(Arrays.asList("attachments", "author_id", "context_annotations", "conversation_id", "created_at", "edit_controls", "edit_history_tweet_ids", "entities", "geo", "id", "in_reply_to_user_id", "lang", "non_public_metrics", "organic_metrics", "possibly_sensitive", "promoted_metrics", "public_metrics", "referenced_tweets", "reply_settings", "source", "text", "withheld"));
        private final Set<String> mediaFieldsAll = new HashSet<>(Arrays.asList("alt_text", "duration_ms", "height", "media_key", "non_public_metrics", "organic_metrics", "preview_image_url", "promoted_metrics", "public_metrics", "type", "url", "variants", "width"));
        private final Set<String> userFieldsAll = new HashSet<>(Arrays.asList("created_at", "description", "entities", "id", "location", "name", "pinned_tweet_id", "profile_image_url", "protected", "public_metrics", "url", "username", "verified", "withheld"));
        private final Set<String> expansionsAll = new HashSet<>(Arrays.asList("attachments.media_keys", "referenced_tweets.id", "sender_id", "participant_ids"));
        private final Set<String> dmEventsFieldsAll = new HashSet<>(Arrays.asList("id", "text", "event_type", "created_at", "dm_conversation_id", "sender_id", "participant_ids", "referenced_tweets", "attachments"));
        private final Set<String> dmEventTypesAll = new HashSet<>(Arrays.asList("MessageCreate", "ParticipantsJoin", "ParticipantsLeave"));

        private boolean isExclude = false;

        public APIfindDmEventsRequest excludeInputFields() {
            isExclude = true;
            return this;
        }

        public APIfindDmEventsRequest tweetFields(Set<String> tweetFields) {
            this.tweetFields = tweetFields;
            return this;
        }

        public APIfindDmEventsRequest expansions(Set<String> expansions) {
            this.expansions = expansions;
            return this;
        }

        public APIfindDmEventsRequest mediaFields(Set<String> mediaFields) {
            this.mediaFields = mediaFields;
            return this;
        }

        public APIfindDmEventsRequest userFields(Set<String> userFields) {
            this.userFields = userFields;
            return this;
        }

        public APIfindDmEventsRequest dmEventsFields(Set<String> dmEventsFields) {
            this.dmEventsFields = dmEventsFields;
            return this;
        }

        public APIfindDmEventsRequest dmEventTypes(Set<String> dmEventTypes) {
            this.dmEventTypes = dmEventTypes;
            return this;
        }

        public APIfindDmEventsRequest maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        public APIfindDmEventsRequest paginationToken(String paginationToken) {
            this.paginationToken = paginationToken;
            return this;
        }

        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return findDmEventsCall(tweetFields, expansions, mediaFields, userFields, dmEventsFields, dmEventTypes, maxResults, paginationToken, _callback);
        }

        public Get2DmEventsResponse execute() throws ApiException {
            tweetFields = getFields("tweetFields", isExclude, tweetFields, tweetFieldsAll);
            expansions = getFields("expansions", isExclude, expansions, expansionsAll);
            mediaFields = getFields("mediaFields", isExclude, mediaFields, mediaFieldsAll);
            userFields = getFields("userFields", isExclude, userFields, userFieldsAll);
            dmEventsFields = getFields("dm_event.fields", isExclude, dmEventsFields, dmEventsFieldsAll);
            dmEventTypes = getFields("event_types", isExclude, dmEventTypes, dmEventTypesAll);

            ApiResponse<Get2DmEventsResponse> localVarResp = findDmEventsCallWithHttpInfo(tweetFields, expansions, mediaFields, userFields, dmEventsFields, dmEventTypes, maxResults, paginationToken);
            return localVarResp.getData();
        }

        public Get2DmEventsResponse execute(Integer retries) throws ApiException {
            Get2DmEventsResponse localVarResp;
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

        public ApiResponse<Get2DmEventsResponse> executeWithHttpInfo() throws ApiException {
            return findDmEventsCallWithHttpInfo(tweetFields, expansions, mediaFields, userFields, dmEventsFields, dmEventTypes, maxResults, paginationToken);
        }

        public okhttp3.Call executeAsync(final ApiCallback<Get2DmEventsResponse> _callback) throws ApiException {
            return findDmEventsCallAsync(tweetFields, expansions, mediaFields, userFields, dmEventsFields, dmEventTypes, maxResults, paginationToken, _callback);
        }
    }

    private Call findDmEventsCall(Set<String> tweetFields, Set<String> expansions, Set<String> mediaFields, Set<String> userFields, Set<String> dmEventsFields, Set<String> dmEventsTypes, Integer maxResults, String paginationToken, ApiCallback callback) throws ApiException {
        Object localVarPostBody = null;

        String localVarPath = "/2/dm_events";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tweetFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "tweet.fields", tweetFields));
        }

        if (expansions != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "expansions", expansions));
        }

        if (mediaFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "media.fields", mediaFields));
        }

        if (userFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "user.fields", userFields));
        }

        if (dmEventsFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "dm_event.fields", dmEventsFields));
        }

        if (dmEventsTypes != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "event_types", dmEventsTypes));
        }

        if (maxResults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max_results", maxResults));
        }

        if (paginationToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pagination_token", paginationToken));
        }

        final String[] localVarAccepts = {
            "application/json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        String[] localVarAuthNames = new String[] { "BearerToken", "OAuth2UserToken", "UserToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, reduceAuthNames(localVarAuthNames), callback);
    }

    private Call findDmEventsValidateBeforeCall(Set<String> tweetFields, Set<String> expansions, Set<String> mediaFields, Set<String> userFields, Set<String> dmEventsFields, Set<String> dmEventsTypes, Integer maxResults, String paginationToken, final ApiCallback _callback) throws ApiException {
        okhttp3.Call localVarCall = findDmEventsCall(tweetFields, expansions, mediaFields, userFields, dmEventsFields, dmEventsTypes, maxResults, paginationToken, _callback);
        return localVarCall;
    }

    private ApiResponse<Get2DmEventsResponse> findDmEventsCallWithHttpInfo(Set<String> tweetFields, Set<String> expansions, Set<String> mediaFields, Set<String> userFields, Set<String> dmEventsFields, Set<String> dmEventsTypes, Integer maxResults, String paginationToken) throws ApiException {
        okhttp3.Call localVarCall = findDmEventsValidateBeforeCall(tweetFields, expansions, mediaFields, userFields, dmEventsFields, dmEventsTypes, maxResults, paginationToken, null);
        try {
            Type localVarReturnType = new TypeToken<Get2DmEventsResponse>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<com.twitter.clientlib.model.ProblemOrError>(){}.getType()));
            throw e;
        }
    }

    private okhttp3.Call findDmEventsCallAsync(Set<String> tweetFields, Set<String> expansions, Set<String> mediaFields, Set<String> userFields, Set<String> dmEventsFields, Set<String> dmEventsTypes, Integer maxResults, String paginationToken, final ApiCallback<Get2DmEventsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = findDmEventsValidateBeforeCall(tweetFields, expansions, mediaFields, userFields, dmEventsFields, dmEventsTypes, maxResults, paginationToken, _callback);
        Type localVarReturnType = new TypeToken<Get2DmEventsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public APIfindDmEventsRequest findDmEvents() {
        return new APIfindDmEventsRequest();
    }

    public APIreplyToDmConversationRequest replyToDmConversation(String conversationId, String text) {
        return new APIreplyToDmConversationRequest(conversationId, text);
    }

    private Call replyToDmConversationValidateBeforeCall(String id, String text, ApiCallback _callback) throws ApiException {
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling replyToDmConversation(Async)");
        }

        if (text == null) {
            throw new ApiException("Missing the required parameter 'text' when calling replyToDmConversation(Async)");
        }

        okhttp3.Call localVarCall = replyToDmConversationCall(id, text, _callback);
        return localVarCall;
    }

    private ApiResponse<ReplyToDmConversationResponse> replyToDmConversationWithHttpInfo(String id, String text) throws ApiException {
        okhttp3.Call localVarCall = replyToDmConversationValidateBeforeCall(id, text, null);
        Type localVarReturnType = new TypeToken<ReplyToDmConversationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private Call replyToDmConversationCallAsync(String id, String text, ApiCallback<ReplyToDmConversationResponse> callback) throws ApiException {
        okhttp3.Call localVarCall = replyToDmConversationValidateBeforeCall(id, text, callback);
        Type localVarReturnType = new TypeToken<ReplyToDmConversationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, callback);
        return localVarCall;
    }

    private Call replyToDmConversationCall(String id, String text, ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new DmEvent(text);

        String localVarPath = "/2/dm_conversations/{id}/messages"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "OAuth2UserToken", "UserToken" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, reduceAuthNames(localVarAuthNames), _callback);
    }

    public class APIreplyToDmConversationRequest {

        private final String id;
        private final String text;

        public APIreplyToDmConversationRequest(String conversationId, String text) {
            this.id = conversationId;
            this.text = text;
        }

        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return replyToDmConversationCall(id, text, _callback);
        }

        public ReplyToDmConversationResponse execute() throws ApiException {
            ApiResponse<ReplyToDmConversationResponse> localVarResp = replyToDmConversationWithHttpInfo(id, text);
            return localVarResp.getData();
        }

        public ReplyToDmConversationResponse execute(Integer retries) throws ApiException {
            ReplyToDmConversationResponse localVarResp;
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

        public ApiResponse<ReplyToDmConversationResponse> executeWithHttpInfo() throws ApiException {
            return replyToDmConversationWithHttpInfo(id, text);
        }

        public okhttp3.Call executeAsync(final ApiCallback<ReplyToDmConversationResponse> _callback) throws ApiException {
            return replyToDmConversationCallAsync(id, text, _callback);
        }
    }

}
