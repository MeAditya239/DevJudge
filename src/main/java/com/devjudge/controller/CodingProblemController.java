package com.devjudge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/problems")
public class CodingProblemController {
    @GetMapping
    public String getAllProblems() {
        return "Fetch ALl coding problems - placeholder";
    }

    @PostMapping
    public String createProblem() {
        return "Create Coding problem - placeholder";
    }
}
