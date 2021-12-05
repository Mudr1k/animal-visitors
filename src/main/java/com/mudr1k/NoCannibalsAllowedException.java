package com.mudr1k;

public class NoCannibalsAllowedException extends RuntimeException {

    public NoCannibalsAllowedException(String message) {
        super(message);
    }
}
