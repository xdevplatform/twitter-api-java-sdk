

# Poll

Represent a Poll attached to a Tweet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier of this poll. | 
**options** | [**List&lt;PollOption&gt;**](PollOption.md) |  | 
**votingStatus** | [**VotingStatusEnum**](#VotingStatusEnum) |  |  [optional]
**endDatetime** | **OffsetDateTime** |  |  [optional]
**durationMinutes** | **Integer** |  |  [optional]



## Enum: VotingStatusEnum

Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;



