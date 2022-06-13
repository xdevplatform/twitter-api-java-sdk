package com.twitter.clientlib.query;

import com.twitter.clientlib.query.model.*;

import java.util.ArrayList;
import java.util.Arrays;
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

        public Builder withMediaFields(MediaField... mediaFields) {
            this.mediaFields.addAll(Arrays.asList(mediaFields));
            return this;
        }

        public Builder withPollFields(PollField... pollFields) {
            this.pollFields.addAll(Arrays.asList(pollFields));
            return this;
        }

        public Builder withUserFields(UserField... userFields) {
            this.userFields.addAll(Arrays.asList(userFields));
            return this;
        }

        public Builder withPlaceFields(PlaceField... placeFields) {
            this.placeFields.addAll(Arrays.asList(placeFields));
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
