package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class RiskScore{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Integer toatalScore;
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
    public void setEvaluatedAt(LocalDateTime )
}