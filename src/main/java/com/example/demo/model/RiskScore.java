package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RiskScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long visitorId;
    private Integer totalScore;

    @Enumerated(EnumType.STRING)
    private RiskLevel riskLevel;

    private LocalDateTime evaluatedAt;

    public enum RiskLevel {
        LOW, MEDIUM, HIGH, CRITICAL
    }

    // Constructors
    public RiskScore() {}

    public RiskScore(Long visitorId, Integer totalScore, RiskLevel riskLevel) {
        this.visitorId = visitorId;
        this.totalScore = totalScore;
        this.riskLevel = riskLevel;
        this.evaluatedAt = LocalDateTime.now();
    }

    // Getters & Setters
    public Long getId() { return id; }
    public Long getVisitorId() { return visitorId; }
    public void setVisitorId(Long visitorId) { this.visitorId = visitorId; }

    public Integer getTotalScore() { return totalScore; }
    public void setTotalScore(Integer totalScore) { this.totalScore = totalScore; }

    public RiskLevel getRiskLevel() { return riskLevel; }
    public void setRiskLevel(RiskLevel riskLevel) { this.riskLevel = riskLevel; }

    public LocalDateTime getEvaluatedAt() { return evaluatedAt; }
    public void setEvaluatedAt(LocalDateTime evaluatedAt) { this.evaluatedAt = evaluatedAt; }
}
