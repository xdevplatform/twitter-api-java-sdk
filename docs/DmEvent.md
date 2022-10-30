

# DmEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attachments** | [**DmEventAttachments**](DmEventAttachments.md) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**dmConversationId** | **String** | Unique identifier of a DM conversation. This can either be a numeric string, or a pair of numeric strings separated by a &#39;-&#39; character in the case of one-on-one DM Conversations. |  [optional] |
|**eventType** | **String** |  |  |
|**id** | **String** | Unique identifier of a DM Event. |  |
|**participantIds** | **List&lt;String&gt;** | A list of participants for a ParticipantsJoin or ParticipantsLeave event_type. |  [optional] |
|**referencedTweets** | [**List&lt;TweetEditComplianceObjectSchemaTweet&gt;**](TweetEditComplianceObjectSchemaTweet.md) | A list of Tweets this DM refers to. |  [optional] |
|**senderId** | **String** | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional] |
|**text** | **String** |  |  [optional] |



