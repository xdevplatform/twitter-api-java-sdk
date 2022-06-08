

# ResourceNotFoundProblem

A problem that indicates that a given Tweet, User, etc. does not exist.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parameter** | **String** |  |  |
|**resourceId** | **String** |  |  |
|**resourceType** | [**ResourceTypeEnum**](#ResourceTypeEnum) |  |  |
|**value** | **String** | Value will match the schema of the field. |  |



## Enum: ResourceTypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| TWEET | &quot;tweet&quot; |
| MEDIA | &quot;media&quot; |
| LIST | &quot;list&quot; |
| SPACE | &quot;space&quot; |



