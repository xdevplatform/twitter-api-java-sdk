package com.twitter.clientlib.model;

import com.google.gson.annotations.SerializedName;

public class ReplyToDmConversationResponse {

    @SerializedName("data")
    private NewDmEvent data;

    public NewDmEvent getData() {
        return data;
    }

    public void setData(NewDmEvent data) {
        this.data = data;
    }
}
