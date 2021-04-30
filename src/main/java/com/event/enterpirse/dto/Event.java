package com.event.enterpirse.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.Date;

/**
 * The Event Class with lombok configuration
 */
public @Data
class Event {
    @SerializedName("eventID")
    private int eventId;
    @SerializedName("eventName")
    String eventName;
    @SerializedName("eventDescription")
    String eventDescription;
    @SerializedName("eventLocation")
    String eventLocation;
    @SerializedName("eventDate")
    Date eventDate;
}
