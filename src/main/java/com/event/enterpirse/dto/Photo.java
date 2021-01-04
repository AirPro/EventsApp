package com.event.enterpirse.dto;

import lombok.Data;

import java.util.Date;

public @Data
class Photo {

    private int photoId;
    String photoName;
    String photoDescription;
    Date photoDate;
}
