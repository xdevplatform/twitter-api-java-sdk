package com.twitter.clientlib.query.model;

import java.util.Arrays;
import java.util.List;

public enum Expansion {
    ATTACHMENTS_MEDIA_KEYS("attachments.media_keys"),
    ATTACHMENTS_POLL_IDS("attachments.poll_ids"),
    AUTHOR_ID("author_id"),
    ENTITIES_MENTIONS_USERNAME("entities.mentions.username"),
    GEO_PLACE_ID("geo.place_id"),
    IN_REPLY_TO_USER_ID("in_reply_to_user_id"),
    REFERENCED_TWEETS_ID("referenced_tweets.id"),
    REFERENCED_TWEETS_ID_AUTHOR_ID("referenced_tweets.id.author_id");

    private final String name;

    Expansion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<Expansion> all() {
        return Arrays.asList(Expansion.values());
    }

}
