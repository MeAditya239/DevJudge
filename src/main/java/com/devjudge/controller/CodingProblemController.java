package com.devjudge.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/problems", produces="application/json")
public class CodingProblemController {
    // Placeholder endpoint – will be implemented in next iteration
    @GetMapping
    public ResponseEntity<String> getAllProblems() {
        return ResponseEntity.ok("Fetch aLl coding problems - (to be implemented)");
    }

    // Placeholder endpoint – will be implemented in next iteration
    @PostMapping(consumes = "application/json")
    public ResponseEntity<String> createProblem() {
        return ResponseEntity.status(201)
                .body("Create coding problem (to be implemented)");
    }
}
