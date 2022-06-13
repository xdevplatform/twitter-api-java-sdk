package com.twitter.clientlib.query.model;

import java.util.Arrays;
import java.util.List;

public enum PollField {
    DURATION_MINUTES("duration_minutes"),
    END_DATETIME("end_datetime"),
    ID("id"),
    OPTIONS("options"),
    VOTING_STATUS("voting_status");

    private final String name;

    PollField(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static List<PollField> all() {
        return Arrays.asList(PollField.values());
    }
}
