package com.twitter.clientlib.exceptions;

public class EmptyStreamTimeoutException extends RuntimeException {
    public EmptyStreamTimeoutException(String message) {
        super(message);
    }
}
