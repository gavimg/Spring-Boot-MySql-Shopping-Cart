package com.gavi.supermarket.enums;

/**
 * Created by Hi on 23-01-2018.
 */
public enum Status {

    Ordered("Ordered"),Cancelled("Cancelled"),Delivered("Delivered");

    private String status;

    Status(String status){
        this.status = status;
    }

}
