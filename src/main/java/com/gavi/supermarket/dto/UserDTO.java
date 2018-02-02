package com.gavi.supermarket.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Hi on 31-01-2018.
 */
@Getter
@Setter
public class UserDTO {

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String email;

    private AdderessDTO addresses;

    private String role;
}
