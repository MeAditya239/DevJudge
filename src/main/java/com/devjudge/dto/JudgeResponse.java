package com.devjudge.dto;

import lombok.Data;

@Data
public class JudgeResponse {
    private boolean success;
    private String output;
    private String error;
}
