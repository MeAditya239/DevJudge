package com.devjudge.controller;

import com.devjudge.dto.JudgeRequest;
import com.devjudge.dto.JudgeResponse;
import com.devjudge.service.JudgeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/judge")
@CrossOrigin
public class JudgeController {

    private final JudgeService judgeService;

    public JudgeController(JudgeService judgeService) {
        this.judgeService = judgeService;
    }

    @PostMapping("/run")
    public JudgeResponse runCode(@RequestBody JudgeRequest request) {
        return judgeService.run(request);
    }
}
