package com.gavi.supermarket.models;

import com.gavi.supermarket.enums.Role;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Hi on 23-01-2018.
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private String email;

    private Address[] address;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Order> orders;


}
