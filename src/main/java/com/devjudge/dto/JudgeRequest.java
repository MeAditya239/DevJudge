package com.devjudge.dto;

import lombok.Data;

@Data
public class JudgeRequest {
    private String code;   // Java source code
    private String input;  // stdin (optional)
}
