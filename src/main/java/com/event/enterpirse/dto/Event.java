package com.event.enterpirse.dto;

import lombok.Data;

import java.util.Date;

public @Data
class Event {
    private int eventId;
    String eventName;
    String eventDescription;
    String eventLocation;
    Date eventDate;
}
