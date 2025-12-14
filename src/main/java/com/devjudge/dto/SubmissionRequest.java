package com.devjudge.dto;

import lombok.Data;

@Data
public class SubmissionRequest {
    private Long problemId;
    private String code;      // Java code
    private String language;  // "JAVA"
}
