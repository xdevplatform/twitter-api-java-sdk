package com.twitter.clientlib.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Get2DmEventsResponse {

    public static final String SERIALIZED_NAME_DATA = "data";
    @SerializedName(SERIALIZED_NAME_DATA)
    private List<DmEvent> data = null;

    public static final String SERIALIZED_NAME_ERRORS = "errors";
    @SerializedName(SERIALIZED_NAME_ERRORS)
    private List<Problem> errors = null;

    public static final String SERIALIZED_NAME_INCLUDES = "includes";
    @SerializedName(SERIALIZED_NAME_INCLUDES)
    private Expansions includes;

    public static final String SERIALIZED_NAME_META = "meta";
    @SerializedName(SERIALIZED_NAME_META)
    private Get2TweetsSearchAllResponseMeta meta;

    public Get2DmEventsResponse() {

    }

    public Get2DmEventsResponse data(List<DmEvent> data) {
        this.data = data;
        return this;
    }

    public Get2DmEventsResponse addDataItem(DmEvent dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public List<DmEvent> getData() {
        return data;
    }

    public void setData(List<DmEvent> data) {
        this.data = data;
    }

    public Get2DmEventsResponse errors(List<Problem> errors) {
        this.errors = errors;
        return this;
    }

    public Get2DmEventsResponse addErrorsItem(Problem errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    public List<Problem> getErrors() {
        return errors;
    }

    public void setErrors(List<Problem> errors) {
        this.errors = errors;
    }

    public Get2DmEventsResponse includes(Expansions includes) {
        this.includes = includes;
        return this;
    }

    public Expansions getIncludes() {
        return includes;
    }

    public void setIncludes(Expansions includes) {
        this.includes = includes;
    }

    public Get2DmEventsResponse meta(Get2TweetsSearchAllResponseMeta meta) {
        this.meta = meta;
        return this;
    }

    public Get2TweetsSearchAllResponseMeta getMeta() {
        return meta;
    }

    public void setMeta(Get2TweetsSearchAllResponseMeta meta) {
        this.meta = meta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Get2DmEventsResponse get2DmEventsResponse = (Get2DmEventsResponse) o;
        return Objects.equals(this.data, get2DmEventsResponse.data) &&
                Objects.equals(this.errors, get2DmEventsResponse.errors) &&
                Objects.equals(this.includes, get2DmEventsResponse.includes) &&
                Objects.equals(this.meta, get2DmEventsResponse.meta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Get2DmEventsResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    includes: ").append(toIndentedString(includes)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
