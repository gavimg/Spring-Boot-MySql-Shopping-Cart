package com.gavi.supermarket.dto;


import lombok.*;

/**
 * Created by Hi on 31-01-2018.
 */
//@Getter
//@Setter
@Data
public class AddressDTO {

    private String postboxNo;

    private String landmark;

    private String zipcode;

    private String phoneNumber;

    private String city;

    public AddressDTO() {}

}
