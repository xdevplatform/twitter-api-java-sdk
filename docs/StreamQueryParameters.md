

# StreamQueryParameters


## Properties


| Name | Type                                         | Description  | Notes |
|------------- |----------------------------------------------| ------------- | -------------|
| **backfillMinutes** | **Integer**                                  | The number of minutes of backfill requested. | [optional] |
| **tweetFields** | [**Collection&lt;TweetField&gt;**](#TweetField) | A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Collection&lt;Expansion&gt;**](#Expansion) | A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Collection&lt;MediaField&gt;**](#MediaField) | A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Collection&lt;PollField&gt;**](#PollField) | A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Collection&lt;UserField&gt;**](#UserField) | A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Collection&lt;PlaceField&gt;**](#PlaceField) | A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |




## Enum: TweetField

| Name | Value |
|---- | -----|
|ATTACHMENTS|&quot;attachments&quot;|
|AUTHOR_ID|&quot;author_id&quot;|
|CONTEXT_ANNOTATIONS|&quot;context_annotations&quot;|
|CONVERSATION_ID|&quot;conversation_id&quot;|
|CREATED_AT|&quot;created_at&quot;|
|ENTITIES|&quot;entities&quot;|
|GEO|&quot;geo&quot;|
|ID|&quot;id&quot;|
|IN_REPLY_TO_USER_ID|&quot;in_reply_to_user_id&quot;|
|LANG|&quot;lang&quot;|
|POSSIBLE_SENSITIVE|&quot;possibly_sensitive&quot;|
|PUBLIC_METRICS|&quot;public_metrics&quot;|
|REFERENCED_TWEETS|&quot;referenced_tweets&quot;|
|REPLY_SETTINGS|&quot;reply_settings&quot;|
|SOURCE|&quot;source&quot;|
|TEXT|&quot;text&quot;|
|WITHHELD|&quot;withheld&quot;|


## Enum: Expansion

| Name | Value |
|---- | -----|
|ATTACHMENTS_MEDIA_KEYS|&quot;attachments.media_keys&quot;|
|ATTACHMENTS_POLL_IDS|&quot;attachments.poll_ids&quot;|
|AUTHOR_ID|&quot;author_id&quot;|
|ENTITIES_MENTIONS_USERNAME|&quot;entities.mentions.username&quot;|
|GEO_PLACE_ID|&quot;geo.place_id&quot;|
|IN_REPLY_TO_USER_ID|&quot;in_reply_to_user_id&quot;|
|REFERENCED_TWEETS_ID|&quot;referenced_tweets.id&quot;|
|REFERENCED_TWEETS_ID_AUTHOR_ID|&quot;referenced_tweets.id.author_id&quot;|

## Enum: MediaField

| Name | Value |
|---- | -----|
|ALT_TEXT|&quot;alt_text&quot;|
|DURATION_MS|&quot;duration_ms&quot;|
|HEIGHT|&quot;height&quot;|
|MEDIA_KEY|&quot;media_key&quot;|
|PREVIEW_IMAGE_URL|&quot;preview_image_url&quot;|
|PUBLIC_METRICS|&quot;public_metrics&quot;|
|TYPE|&quot;type&quot;|
|URL|&quot;url&quot;|
|VARIANTS|&quot;variants&quot;|
|WIDTH|&quot;width&quot;|


## Enum: PollField

| Name | Value |
|---- | -----|
|DURATION_MINUTES|&quot;duration_minutes&quot;|
|END_DATETIME|&quot;end_datetime&quot;|
|ID|&quot;id&quot;|
|OPTIONS|&quot;options&quot;|
|VOTING_STATUS|&quot;voting_status&quot;|

## Enum: UserField

| Name | Value |
|---- | -----|
|CREATED_AT|&quot;created_at&quot;|
|DESCRIPTION|&quot;description&quot;|
|ENTITIES|&quot;entities&quot;|
|ID|&quot;id&quot;|
|LOCATION|&quot;location&quot;|
|NAME|&quot;name&quot;|
|PINNED_TWEET_ID|&quot;pinned_tweet_id&quot;|
|PROFILE_IMAGE_URL|&quot;profile_image_url&quot;|
|PROTECTED|&quot;protected&quot;|
|PUBLIC_METRICS|&quot;public_metrics&quot;|
|URL|&quot;url&quot;|
|USERNAME|&quot;username&quot;|
|VERIFIED|&quot;verified&quot;|
|WITHHELD|&quot;withheld&quot;|

## Enum: PlaceField

| Name | Value |
|---- | -----|
|CONTAINED_WITHIN|&quot;contained_within&quot;|
|COUNTRY|&quot;country&quot;|
|COUNTRY_CODE|&quot;country_code&quot;|
|FULL_NAME|&quot;full_name&quot;|
|GEO|&quot;geo&quot;|
|ID|&quot;id&quot;|
|NAME|&quot;name&quot;|
|PLACE_TYPE|&quot;place_type&quot;|