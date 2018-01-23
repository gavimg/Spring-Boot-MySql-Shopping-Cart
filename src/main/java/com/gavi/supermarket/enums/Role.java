package com.gavi.supermarket.enums;

/**
 * Created by Hi on 23-01-2018.
 */
public enum Role {
    User("User"), Admin("Admin"),SuperAdmin("SuperAdmin");

    private String role;

    Role(String role){
        this.role = role;
    }
}
