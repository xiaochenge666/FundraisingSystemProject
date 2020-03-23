package com.crowd.exception;

public class AccessForbiddenException extends RuntimeException {

    public AccessForbiddenException() {

    }

    public AccessForbiddenException(String message) {
        super(message);
    }

    public AccessForbiddenException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessForbiddenException(Throwable cause) {
        super(cause);
    }

}
