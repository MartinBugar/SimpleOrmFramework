package com.martyx.simpleormframework.exceptions;

public class MissingIdException extends RuntimeException {
    public MissingIdException(String message) {
        super(message);
    }
}
