package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
@Table(name = "score_audit_logs")
public class ScoreAuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "rule_id")
    private RiskRule appliedRule;

    @Column(nullable = false)
    private Integer scoreChange;

    @Column(nullable = false)
    private String reason;

    private LocalDateTime loggedAt;

    @PrePersist
    public void onLog() {
        if (scoreChange == null || scoreChange < 0) {
            throw new RuntimeException("scoreChange must be >= 0");
        }
        if (reason == null || reason.trim().isEmpty()) {
            throw new RuntimeException("reason required");
        }
        this.loggedAt = LocalDateTime.now();
    }

    // Getters and Setters
}
