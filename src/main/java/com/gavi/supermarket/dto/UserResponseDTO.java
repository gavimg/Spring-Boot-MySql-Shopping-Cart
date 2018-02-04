package com.gavi.supermarket.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Hi on 31-01-2018.
 */
@Getter
@Setter
public class UserResponseDTO {

    private long userId;

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String email;

    private AddressDTO address;

    private String role;

}
