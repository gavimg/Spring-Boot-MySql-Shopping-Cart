package com.gavi.supermarket.exceptions;

/**
 * Created by Hi on 02-02-2018.
 */
public class ConflictException extends  Exception{

    private String message;

    public ConflictException(String message) {
        super(message);
        this.message = message;
    }
}
