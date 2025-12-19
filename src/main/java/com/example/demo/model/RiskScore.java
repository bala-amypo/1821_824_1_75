package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "risk_scores")
public class RiskScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long visitorId;

    @Column(nullable = false)
    private Integer score;

    private String riskLevel;

    public RiskScore() {
    }

    public RiskScore(Long visitorId, Integer score, String riskLevel) {
        this.visitorId = visitorId;
        this.score = score;
        this.riskLevel = riskLevel;
    }

    public Long getId() {
        return id;
    }

    public Long getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Long visitorId) {
        this.visitorId = visitorId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
}
