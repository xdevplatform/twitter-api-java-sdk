

# Poll

Represent a Poll attached to a Tweet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**durationMinutes** | **Integer** |  |  [optional] |
|**endDatetime** | **OffsetDateTime** |  |  [optional] |
|**id** | **String** | Unique identifier of this poll. |  |
|**options** | [**List&lt;PollOption&gt;**](PollOption.md) |  |  |
|**votingStatus** | [**VotingStatusEnum**](#VotingStatusEnum) |  |  [optional] |



## Enum: VotingStatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |



