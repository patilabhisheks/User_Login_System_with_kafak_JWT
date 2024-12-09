package com.example.user_login.dto;

import lombok.Data;

@Data
public class LogIn {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
