package com.devjudge.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @Column(unique = true)
    private String accessCode;

    private boolean isActive;

    private int durationMin;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne
    private User createdBy;
}
