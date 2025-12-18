package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
public class RiskScore{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Integer totalScore;
    public enum riskLevel{
        LOW,
        MEDIUM,
        HIGH,
        CRITICAL
    }
    private LocalDateTime evaluatedAt;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Integer getTotalScore(){
        return totalScore;
    }
    public void setTotalScore(Integer totalScore){
        this.totalScore=totalScore;
    }
    public LocalDateTime getEvaluatedAt(){
        return evaluatedAt;
    }
    public void setEvaluatedAt(LocalDateTime evaluatedAt){
        this.evaluatedAt=evaluatedAt;
    }
    public RiskLevel getRiskLevel(){
        return riskLevel;
    }
    public void setRiskLevel(RiskLevel riskLevel){
        this.riskLevel=riskLevel;
    }
    public RiskScore(Long id,Integer totalScore,LocalDateTime evaluatedAt,RiskLevel riskLevel){
        this.id=id;
        this.totalScore=totalScore;
        this.riskLevel=riskLevel;
        this.evaluatedAt=evaluatedAt;

    }
    public RiskScore()
    {}
}