package com.example.skypro_spring_listAndSet.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ArrayIsFull extends RuntimeException {
    public ArrayIsFull() {
    }

    public ArrayIsFull(String message) {
        super(message);
    }

    public ArrayIsFull(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayIsFull(Throwable cause) {
        super(cause);
    }

    public ArrayIsFull(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
