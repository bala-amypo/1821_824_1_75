package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ScoreAuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "visitor_id", nullable = false)
    private Visitor visitor;

    @ManyToOne
    @JoinColumn(name = "rule_id", nullable = false)
    private RiskRule appliedRule;

    private Integer scoreChange;

    @Column(nullable = false)
    private String reason;

    private LocalDateTime loggedAt;

    @PrePersist
    public void prePersist() {
        this.loggedAt = LocalDateTime.now();
        if (scoreChange != null && scoreChange < 0) scoreChange = 0;
        if (reason == null || reason.isBlank()) throw new IllegalArgumentException("reason required");
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Visitor getVisitor() { return visitor; }
    public void setVisitor(Visitor visitor) { this.visitor = visitor; }

    public RiskRule getAppliedRule() { return appliedRule; }
    public void setAppliedRule(RiskRule appliedRule) { this.appliedRule = appliedRule; }

    public Integer getScoreChange() { return scoreChange; }
    public void setScoreChange(Integer scoreChange) { this.scoreChange = scoreChange; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public LocalDateTime getLoggedAt() { return loggedAt; }
    public void setLoggedAt(LocalDateTime loggedAt) { this.loggedAt = loggedAt; }
}
