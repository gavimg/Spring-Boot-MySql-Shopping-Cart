package com.gavi.supermarket.models;

import lombok.Data;

import javax.persistence.Embeddable;

/**
 * Created by Hi on 23-01-2018.
 */
@Embeddable
@Data
public class Address {

    private String postboxNo;

    private String landmark;

    private String zipcode;

    private String phoneNumber;

    private String city;
}
