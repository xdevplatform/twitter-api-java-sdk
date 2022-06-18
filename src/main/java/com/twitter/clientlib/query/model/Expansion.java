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
