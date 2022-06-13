package com.twitter.clientlib.query.model;

import java.util.Arrays;
import java.util.List;

public enum TweetField {
    ATTACHMENTS("attachments"),
    AUTHOR_ID("author_id"),
    CONTEXT_ANNOTATIONS("context_annotations"),
    CONVERSATION_ID("conversation_id"),
    CREATED_AT("created_at"),
    ENTITIES("entities"),
    GEO("geo"),
    ID("id"),
    IN_REPLY_TO_USER_ID("in_reply_to_user_id"),
    LANG("lang"),
    POSSIBLE_SENSITIVE("possibly_sensitive"),
    PUBLIC_METRICS("public_metrics"),
    REFERENCED_TWEETS("referenced_tweets"),
    REPLY_SETTINGS("reply_settings"),
    SOURCE("source"),
    TEXT("text"),
    WITHHELD("withheld");

    private final String name;

    TweetField(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<TweetField> all() {
        return Arrays.asList(TweetField.values());
    }

}
