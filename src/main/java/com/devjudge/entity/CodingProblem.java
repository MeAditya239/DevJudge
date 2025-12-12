package com.devjudge.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CodingProblem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String difficulty;

    @Column(columnDefinition = "TEXT")
    private String sampleInput;

    @Column(columnDefinition = "TEXT")
    private String expectedOutput;

    @ManyToOne
    private User createdBy;
}
