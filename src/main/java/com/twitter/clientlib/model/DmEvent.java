package com.twitter.clientlib.model;

import com.google.gson.annotations.SerializedName;

import java.time.OffsetDateTime;

public class DmEvent {

    @SerializedName("id")
    private String id;

    @SerializedName("sender_id")
    private String senderId;

    @SerializedName("event_type")
    private String eventType; // TODO enum

    @SerializedName("text")
    private String text;

    @SerializedName("dm_conversation_id")
    private String dmConversationId;

    @SerializedName("created_at")
    private OffsetDateTime createdAt;

    public DmEvent() {

    }

    public DmEvent(String text) {
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDmConversationId() {
        return dmConversationId;
    }

    public void setDmConversationId(String dmConversationId) {
        this.dmConversationId = dmConversationId;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DmEvent {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    dmConversationId: ").append(toIndentedString(dmConversationId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
