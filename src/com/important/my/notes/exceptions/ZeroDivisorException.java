package com.important.my.notes.exceptions;

public class ZeroDivisorException extends Exception {

    public ZeroDivisorException(Exception exception) {
        super(exception);
    }

    public ZeroDivisorException(String message) {
        super(message);
    }
}
