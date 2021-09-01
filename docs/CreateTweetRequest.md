

# CreateTweetRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | The content of the Tweet. |  [optional]
**directMessageDeepLink** | **String** | Link to take the conversation from the public timeline to a private Direct Message. |  [optional]
**quoteTweetId** | **String** | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**forSuperFollowersOnly** | **Boolean** | Exclusive Tweet for super followers. |  [optional]
**reply** | [**CreateTweetRequestReply**](CreateTweetRequestReply.md) |  |  [optional]
**media** | [**CreateTweetRequestMedia**](CreateTweetRequestMedia.md) |  |  [optional]
**poll** | [**CreateTweetRequestPoll**](CreateTweetRequestPoll.md) |  |  [optional]
**replySettings** | [**ReplySettingsEnum**](#ReplySettingsEnum) | Settings to indicate who can reply to the Tweet. |  [optional]
**geo** | [**CreateTweetRequestGeo**](CreateTweetRequestGeo.md) |  |  [optional]



## Enum: ReplySettingsEnum

Name | Value
---- | -----
FOLLOWING | &quot;following&quot;
MENTIONEDUSERS | &quot;mentionedUsers&quot;



