package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ScoreAuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Visitor visitor;

    @ManyToOne(optional = false)
    private RiskRule appliedRule;

    @Column(nullable = false)
    private Integer scoreChange;

    @Column(nullable = false)
    private String reason;

    private LocalDateTime loggedAt;

    @PrePersist
    public void prePersist() {
        if (loggedAt == null) loggedAt = LocalDateTime.now();
    }

    // Getters and Setters
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
