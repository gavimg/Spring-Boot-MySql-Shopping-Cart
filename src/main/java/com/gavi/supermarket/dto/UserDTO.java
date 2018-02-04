package com.gavi.supermarket.dto;

import lombok.*;

/**
 * Created by Hi on 31-01-2018.
 */
@Data
public class UserDTO {

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String email;

    private AddressDTO addresses;

    private String role;

    public  UserDTO(){}
}
