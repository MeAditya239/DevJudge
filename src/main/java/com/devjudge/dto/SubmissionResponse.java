package com.devjudge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SubmissionResponse {
    private String verdict;   // ACCEPTED / WRONG_ANSWER / COMPILATION_ERROR / RUNTIME_ERROR
    private String output;
}
