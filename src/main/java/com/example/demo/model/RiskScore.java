package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RiskScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    private Visitor visitor;

    @Column(nullable = false)
    private Integer totalScore;

    private String riskLevel;

    private LocalDateTime evaluatedAt;

    @PrePersist
    public void prePersist() {
        if (evaluatedAt == null) evaluatedAt = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Visitor getVisitor() { return visitor; }
    public void setVisitor(Visitor visitor) { this.visitor = visitor; }

    public Integer getTotalScore() { return totalScore; }
    public void setTotalScore(Integer totalScore) { this.totalScore = totalScore; }

    public String getRiskLevel() { return riskLevel; }
    public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }

    public LocalDateTime getEvaluatedAt() { return evaluatedAt; }
    public void setEvaluatedAt(LocalDateTime evaluatedAt) { this.evaluatedAt = evaluatedAt; }
}
