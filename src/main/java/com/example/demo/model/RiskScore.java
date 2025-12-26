package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class RiskScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer totalScore;
    private String riskLevel;

    @OneToOne
    @JoinColumn(name = "visitor_id")
    private Visitor visitor;

    public RiskScore() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getTotalScore() { return totalScore; }
    public void setTotalScore(Integer totalScore) { this.totalScore = totalScore; }

    public String getRiskLevel() { return riskLevel; }
    public void setRiskLevel(String riskLevel) { this.riskLevel = riskLevel; }

    public Visitor getVisitor() { return visitor; }
    public void setVisitor(Visitor visitor) { this.visitor = visitor; }
}
