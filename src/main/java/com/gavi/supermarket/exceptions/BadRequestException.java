package com.gavi.supermarket.exceptions;

/**
 * Created by Hi on 04-02-2018.
 */
public class BadRequestException extends Exception {

    private static final long serialVersionUID = 1L;

    public BadRequestException(String message) {
        super(message);
    }

}