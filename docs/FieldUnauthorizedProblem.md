

# FieldUnauthorizedProblem

A problem that indicates that you are not allowed to see a particular field on a Tweet, User, etc.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**section** | [**SectionEnum**](#SectionEnum) |  | 
**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) |  | 
**field** | **String** |  | 



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
LIST | &quot;list&quot;
SPACE | &quot;space&quot;



