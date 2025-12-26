package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ScoreAuditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long visitorId;
    private Long ruleId;
    private Integer scoreChange;
    private String reason;
    private LocalDateTime createdAt;

    public ScoreAuditLog() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getVisitorId() { return visitorId; }
    public void setVisitorId(Long visitorId) { this.visitorId = visitorId; }

    public Long getRuleId() { return ruleId; }
    public void setRuleId(Long ruleId) { this.ruleId = ruleId; }

    public Integer getScoreChange() { return scoreChange; }
    public void setScoreChange(Integer scoreChange) { this.scoreChange = scoreChange; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
