package com.gavi.supermarket.exceptions;

/**
 * Created by Hi on 31-01-2018.
 */
public class DataNotFoundException extends Exception {

    private String message;


    public DataNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
