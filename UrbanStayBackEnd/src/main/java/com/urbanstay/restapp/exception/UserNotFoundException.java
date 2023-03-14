package com.urbanstay.restapp.exception;


public class UserNotFoundException extends Exception{

    public UserNotFoundException(String message)
    {
        super(message);
    }
}
