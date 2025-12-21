package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
@Table(name = "risk_scores")
public class RiskScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "visitor_id", unique = true)
    private Visitor visitor;

    @Column(nullable = false)
    private Integer totalScore;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RiskLevel riskLevel;

    private LocalDateTime evaluatedAt;

    public enum RiskLevel {
        LOW,
        MEDIUM,
        HIGH,
        CRITICAL
    }

    @PrePersist
    @PreUpdate
    public void validateAndEvaluate() {
        if (totalScore == null || totalScore < 0) {
            throw new RuntimeException("totalScore must be >= 0");
        }
        this.riskLevel = RiskLevelUtils.fromScore(totalScore);
        this.evaluatedAt = LocalDateTime.now();
    }

    // Getters and Setters
}
