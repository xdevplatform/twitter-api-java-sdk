

# FieldUnauthorizedProblem

A problem that indicates that you are not allowed to see a particular field on a Tweet, User, etc.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | **String** |  |  |
|**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) |  |  |
|**section** | [**SectionEnum**](#SectionEnum) |  |  |



## Enum: ResourceTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| TWEET | &quot;tweet&quot; |
| MEDIA | &quot;media&quot; |
| LIST | &quot;list&quot; |
| SPACE | &quot;space&quot; |



## Enum: SectionEnum

| Name | Value |
|---- | -----|
| DATA | &quot;data&quot; |
| INCLUDES | &quot;includes&quot; |



