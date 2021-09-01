

# Space


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique identifier of this Space. | 
**state** | [**StateEnum**](#StateEnum) | The current state of the space. | 
**startedAt** | **OffsetDateTime** | When the space was started as a date string |  [optional]
**isTicketed** | **Boolean** | Denotes if the space is a ticketed space |  [optional]
**participantCount** | **Integer** | The number of participants in a space |  [optional]
**title** | **String** | The title of the space |  [optional]
**hostIds** | **List&lt;String&gt;** | The user ids for the hosts of the space |  [optional]
**updatedAt** | **OffsetDateTime** | When the space was last updated |  [optional]
**createdAt** | **OffsetDateTime** | Creation time of the space |  [optional]
**creatorId** | **String** | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**lang** | **String** | The language of the space |  [optional]
**speakerIds** | **List&lt;String&gt;** | An array of user ids for people who were speakers in a space |  [optional]
**invitedUserIds** | **List&lt;String&gt;** | An array of user ids for people who were invited to a space |  [optional]
**scheduledStart** | **OffsetDateTime** | A date time stamp for when a space is scheduled to begin |  [optional]
**endedAt** | **OffsetDateTime** | End time of the space |  [optional]
**topics** | [**List&lt;SpaceTopics&gt;**](SpaceTopics.md) | The topics of a space, as selected by its creator |  [optional]
**subscriberCount** | **Integer** | The number of people who have either purchased a ticket or set a reminder for this space. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
LIVE | &quot;live&quot;
SCHEDULED | &quot;scheduled&quot;
ENDED | &quot;ended&quot;



