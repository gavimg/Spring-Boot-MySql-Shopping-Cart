package com.gavi.supermarket.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Hi on 31-01-2018.
 */
//@Getter
//@Setter
public class LoginDTO {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
