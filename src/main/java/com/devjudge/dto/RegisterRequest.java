package com.devjudge.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    // STUDENT / TRAINER / RECRUITER / ADMIN
    private String role;
}
