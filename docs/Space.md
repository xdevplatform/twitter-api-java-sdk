

# Space



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | Creation time of the Space. |  [optional] |
|**creatorId** | **String** | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional] |
|**endedAt** | **OffsetDateTime** | End time of the Space. |  [optional] |
|**hostIds** | **List&lt;String&gt;** | The user ids for the hosts of the Space. |  [optional] |
|**id** | **String** | The unique identifier of this Space. |  |
|**invitedUserIds** | **List&lt;String&gt;** | An array of user ids for people who were invited to a Space. |  [optional] |
|**isTicketed** | **Boolean** | Denotes if the Space is a ticketed Space. |  [optional] |
|**lang** | **String** | The language of the Space. |  [optional] |
|**participantCount** | **Integer** | The number of participants in a Space. |  [optional] |
|**scheduledStart** | **OffsetDateTime** | A date time stamp for when a Space is scheduled to begin. |  [optional] |
|**speakerIds** | **List&lt;String&gt;** | An array of user ids for people who were speakers in a Space. |  [optional] |
|**startedAt** | **OffsetDateTime** | When the Space was started as a date string. |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | The current state of the Space. |  |
|**subscriberCount** | **Integer** | The number of people who have either purchased a ticket or set a reminder for this Space. |  [optional] |
|**title** | **String** | The title of the Space. |  [optional] |
|**topics** | [**List&lt;SpaceTopicsInner&gt;**](SpaceTopicsInner.md) | The topics of a Space, as selected by its creator. |  [optional] |
|**updatedAt** | **OffsetDateTime** | When the Space was last updated. |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| LIVE | &quot;live&quot; |
| SCHEDULED | &quot;scheduled&quot; |
| ENDED | &quot;ended&quot; |



