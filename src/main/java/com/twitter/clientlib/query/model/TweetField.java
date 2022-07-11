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
