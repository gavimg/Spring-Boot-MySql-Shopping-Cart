package com.gavi.supermarket.exceptions;

/**
 * Created by Hi on 04-02-2018.
 */

public class InvalidInputException extends Exception {

    public final static String USERNAME_ALREADY_AVAILABLE = "Username Already Available";

    public final static String USERNAME_INSUFFICIENT_LENGTH = " Username length should be minumum "
            + "of 8 charaters";

    public final static String EMAIL_ALREADY_AVAILABLE = " Emails Already Available";

    /**
     *
     */
    public InvalidInputException() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     */
    public InvalidInputException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param cause
     */
    public InvalidInputException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     */
    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    public InvalidInputException(String message, Throwable cause,
                                 boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

}
