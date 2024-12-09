package com.example.user_login.exception;

public class UserValidationException extends RuntimeException{
    public UserValidationException(String message)
    {
        super(message);
    }
}
