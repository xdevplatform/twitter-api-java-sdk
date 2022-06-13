package com.twitter.clientlib.query.model;

import java.util.Arrays;
import java.util.List;

public enum PlaceField {
    CONTAINED_WITHIN("contained_within"),
    COUNTRY("country"),
    COUNTRY_CODE("country_code"),
    FULL_NAME("full_name"),
    GEO("geo"),
    ID("id"),
    NAME("name"),
    PLACE_TYPE("place_type");

    private final String name;

    PlaceField(String name) {
        this.name = name;
    }

    public static List<PlaceField> all() {
        return Arrays.asList(PlaceField.values());
    }

    public String getName() {
        return name;
    }
}
