package com.event.enterpirse.dto;

import lombok.Data;

/**
 * use lombok to make Person class
 * lambok allows for annotations very nice
 */
public @Data
class Person {

    private int personId;
    String firstName;
    String lastName;
    String address;
    String homePhone;
    String cellPhone;
    String businessPhone;
    String personalEmail;
    String businessEmail;
    String businessName;
}
