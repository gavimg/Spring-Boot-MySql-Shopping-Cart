package com.gavi.supermarket.dto;

import com.gavi.supermarket.enums.Role;
import com.gavi.supermarket.models.Address;
import com.sun.org.apache.bcel.internal.generic.LSTORE;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

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

    private AdderessDTO address;

    private String role;

}
