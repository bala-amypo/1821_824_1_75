package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RiskRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String ruleName;

    @Column(nullable = false)
    private String ruleType;

    @Column(nullable = false)
    private Integer threshold;

    @Column(nullable = false)
    private Integer scoreImpact;

    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        if (createdAt == null) createdAt = LocalDateTime.now();
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRuleName() { return ruleName; }
    public void setRuleName(String ruleName) { this.ruleName = ruleName; }

    public String getRuleType() { return ruleType; }
    public void setRuleType(String ruleType) { this.ruleType = ruleType; }

    public Integer getThreshold() { return threshold; }
    public void setThreshold(Integer threshold) { this.threshold = threshold; }

    public Integer getScoreImpact() { return scoreImpact; }
    public void setScoreImpact(Integer scoreImpact) { this.scoreImpact = scoreImpact; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
