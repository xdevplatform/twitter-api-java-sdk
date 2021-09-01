

# ResourceUnauthorizedProblem

A problem that indicates you are not allowed to see a particular Tweet, User, etc.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** |  | 
**parameter** | **String** |  | 
**section** | [**SectionEnum**](#SectionEnum) |  | 
**resourceId** | **String** |  | 
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) |  | 



## Enum: SectionEnum

Name | Value
---- | -----
DATA | &quot;data&quot;
INCLUDES | &quot;includes&quot;



## Enum: ResourceTypeEnum

Name | Value
---- | -----
TWEET | &quot;tweet&quot;
USER | &quot;user&quot;
MEDIA | &quot;media&quot;



