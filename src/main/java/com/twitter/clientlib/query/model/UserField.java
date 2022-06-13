package com.twitter.clientlib.query.model;

import java.util.Arrays;
import java.util.List;

public enum UserField {
    CREATED_AT("created_at"),
    DESCRIPTION("description"),
    ENTITIES("entities"),
    ID("id"),
    LOCATION("location"),
    NAME("name"),
    PINNED_TWEET_ID("pinned_tweet_id"),
    PROFILE_IMAGE_URL("profile_image_url"),
    PROTECTED("protected"),
    PUBLIC_METRICS("public_metrics"),
    URL("url"),
    USERNAME("username"),
    VERIFIED("verified"),
    WITHHELD("withheld");

    private final String name;

    UserField(String name) {
        this.name = name;
    }

    public static List<UserField> all() {
        return Arrays.asList(UserField.values());
    }

    public String getName() {
        return name;
    }
}
