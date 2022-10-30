

# TweetCreateRequestPoll

Poll options for a Tweet with a poll. This is mutually exclusive from Media, Quote Tweet Id, and Card URI.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**durationMinutes** | **Integer** | Duration of the poll in minutes. |  |
|**options** | **List&lt;String&gt;** |  |  |
|**replySettings** | [**ReplySettingsEnum**](#ReplySettingsEnum) | Settings to indicate who can reply to the Tweet. |  [optional] |



## Enum: ReplySettingsEnum

| Name | Value |
|---- | -----|
| FOLLOWING | &quot;following&quot; |
| MENTIONEDUSERS | &quot;mentionedUsers&quot; |



