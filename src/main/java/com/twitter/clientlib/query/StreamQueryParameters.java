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

package com.twitter.clientlib.query;

import com.twitter.clientlib.query.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQueryParameters {
    private List<TweetField> tweetFields;
    private List<Expansion> expansions;
    private List<MediaField> mediaFields;
    private List<PollField> pollFields;
    private List<UserField> userFields;
    private List<PlaceField> placeFields;
    private Integer backFillMinutes;

    private StreamQueryParameters(Builder builder) {
        this.tweetFields = builder.tweetFields;
        this.expansions = builder.expansions;
        this.mediaFields = builder.mediaFields;
        this.pollFields = builder.pollFields;
        this.userFields = builder.userFields;
        this.placeFields = builder.placeFields;
        this.backFillMinutes = builder.backFillMinutes;
    }

    public List<String> getTweetFields() {
        return tweetFields.stream().map(TweetField::getName).collect(Collectors.toList());
    }

    public void setTweetFields(List<TweetField> tweetFields) {
        this.tweetFields = tweetFields;
    }

    public List<String> getExpansions() {
        return expansions.stream().map(Expansion::getName).collect(Collectors.toList());
    }

    public void setExpansions(List<Expansion> expansions) {
        this.expansions = expansions;
    }

    public List<String> getMediaFields() {
        return mediaFields.stream().map(MediaField::getName).collect(Collectors.toList());
    }

    public void setMediaFields(List<MediaField> mediaFields) {
        this.mediaFields = mediaFields;
    }

    public List<String> getPollFields() {
        return pollFields.stream().map(PollField::getName).collect(Collectors.toList());
    }

    public void setPollFields(List<PollField> pollFields) {
        this.pollFields = pollFields;
    }

    public List<String> getUserFields() {
        return userFields.stream().map(UserField::getName).collect(Collectors.toList());
    }

    public void setUserFields(List<UserField> userFields) {
        this.userFields = userFields;
    }

    public List<String> getPlaceFields() {
        return placeFields.stream().map(PlaceField::getName).collect(Collectors.toList());
    }

    public void setPlaceFields(List<PlaceField> placeFields) {
        this.placeFields = placeFields;
    }

    public Integer getBackFillMinutes() {
        return backFillMinutes;
    }

    public void setBackFillMinutes(Integer backFillMinutes) {
        this.backFillMinutes = backFillMinutes;
    }

    public static class Builder {
        private final List<TweetField> tweetFields;
        private final List<Expansion> expansions;
        private final List<MediaField> mediaFields;
        private final List<PollField> pollFields;
        private final List<UserField> userFields;
        private final List<PlaceField> placeFields;
        private Integer backFillMinutes = 0;

        public Builder() {
            this.tweetFields = new ArrayList<>();
            this.expansions = new ArrayList<>();
            this.mediaFields = new ArrayList<>();
            this.pollFields = new ArrayList<>();
            this.userFields = new ArrayList<>();
            this.placeFields = new ArrayList<>();
        }

        public Builder withTweetFields(TweetField... tweetFields) {
            this.tweetFields.addAll(Arrays.asList(tweetFields));
            return this;
        }

        public Builder withTweetFields(Collection<TweetField> tweetFields) {
            this.tweetFields.addAll(tweetFields);
            return this;
        }

        public Builder withMediaFields(MediaField... mediaFields) {
            this.mediaFields.addAll(Arrays.asList(mediaFields));
            return this;
        }

        public Builder withMediaFields(Collection<MediaField> mediaFields) {
            this.mediaFields.addAll(mediaFields);
            return this;
        }

        public Builder withPollFields(PollField... pollFields) {
            this.pollFields.addAll(Arrays.asList(pollFields));
            return this;
        }

        public Builder withPollFields(Collection<PollField> pollFields) {
            this.pollFields.addAll(pollFields);
            return this;
        }

        public Builder withUserFields(UserField... userFields) {
            this.userFields.addAll(Arrays.asList(userFields));
            return this;
        }

        public Builder withUserFields(Collection<UserField> userFields) {
            this.userFields.addAll(userFields);
            return this;
        }

        public Builder withPlaceFields(PlaceField... placeFields) {
            this.placeFields.addAll(Arrays.asList(placeFields));
            return this;
        }

        public Builder withPlaceFields(Collection<PlaceField> placeFields) {
            this.placeFields.addAll(placeFields);
            return this;
        }

        public Builder withExpansions(Expansion... expansions) {
            this.expansions.addAll(Arrays.asList(expansions));
            return this;
        }

        public Builder withExpansions(Collection<Expansion> expansions) {
            this.expansions.addAll(expansions);
            return this;
        }

        public Builder withBackfillMinutes(Integer backFillMinutes) {
            this.backFillMinutes = backFillMinutes;
            return this;
        }

        public StreamQueryParameters build() {
            return new StreamQueryParameters(this);
        }
    }
}
