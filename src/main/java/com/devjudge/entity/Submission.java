package com.devjudge.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long testId;
    private Long problemId;

    @Column(columnDefinition = "LONGTEXT")
    private String code;

    private String output;
    private String language;

    private String verdict;
    private int score;

    private LocalDateTime submittedAt;
}
