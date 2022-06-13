package com.twitter.clientlib.query.model;

import java.util.Arrays;
import java.util.List;

public enum MediaField {
    ALT_TEXT("alt_text"),
    DURATION_MS("duration_ms"),
    HEIGHT("height"),
    MEDIA_KEY("media_key"),
    PREVIEW_IMAGE_URL("preview_image_url"),
    PUBLIC_METRICS("public_metrics"),
    TYPE("type"),
    URL("url"),
    VARIANTS("variants"),
    WIDTH("width"),;

    private final String name;

    MediaField(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<MediaField> all() {
        return Arrays.asList(MediaField.values());
    }

}
