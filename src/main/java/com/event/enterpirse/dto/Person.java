package com.event.enterpirse.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * use lombok to make Person class
 * lambok allows for annotations very nice
 */
public @Data
class Person {

    @SerializedName("personId")
    private int personId;
    @SerializedName("firstName")
    String firstName;
    @SerializedName("lastName")
    String lastName;
    @SerializedName("address")
    String address;
    @SerializedName("homePhone")
    String homePhone;
    @SerializedName("cellPhone")
    String cellPhone;
    @SerializedName("businessPhone")
    String businessPhone;
    @SerializedName("personalEmail")
    String personalEmail;
    @SerializedName("businessEmail")
    String businessEmail;
    @SerializedName("businessName")
    String businessName;
}
