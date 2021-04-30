package com.event.enterpirse.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.Date;

/**
 * Class definitions and attribute for Photo
 */
public @Data
class Photo {

    @SerializedName("photoID")
    private int photoId;
    @SerializedName("photoName")
    String photoName;
    @SerializedName("photoDescription")
    String photoDescription;
    @SerializedName("photoDate")
    Date photoDate;
}
