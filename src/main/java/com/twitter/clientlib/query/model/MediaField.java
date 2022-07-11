/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/

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
