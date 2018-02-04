package com.gavi.supermarket.dto;


import lombok.*;

/**
 * Created by Hi on 31-01-2018.
 */
//@Getter
//@Setter
//@Getter
//@Setter
public class AddressDTO {

    private String postboxNo;

    private String landmark;

    private String zipcode;

    private String phoneNumber;

    private String city;

    public AddressDTO() {}

    public String getPostboxNo() {
        return postboxNo;
    }

    public void setPostboxNo(String postboxNo) {
        this.postboxNo = postboxNo;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
