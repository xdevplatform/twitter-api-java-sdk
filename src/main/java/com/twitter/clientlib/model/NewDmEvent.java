package com.twitter.clientlib.model;

import com.google.gson.annotations.SerializedName;

public class NewDmEvent {

    @SerializedName("dm_conversation_id")
    private String dmConversationId;

    @SerializedName("dm_event_id")
    private String dmEventId;

    public String getDmConversationId() {
        return dmConversationId;
    }

    public void setDmConversationId(String dmConversationId) {
        this.dmConversationId = dmConversationId;
    }

    public String getDmEventId() {
        return dmEventId;
    }

    public void setDmEventId(String dmEventId) {
        this.dmEventId = dmEventId;
    }
}
