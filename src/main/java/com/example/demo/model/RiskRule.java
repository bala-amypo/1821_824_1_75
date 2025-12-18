package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
public class RiskRule{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String ruleName;
    private Integer threshold;
    private Integer scoreImpact;
    private LocalDateTime createdAt;
    public enum RuleType{
        AFTER_HOURS,
        FREQUENT_VISITS,
        BLACKLISK,
        KEYWORD,
        CUSTOM
    }
    private RuleType ruleType;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getRuleName(){
        return ruleName;
    }
    public void setRuleName(String ruleName){
        this.ruleName=ruleName;
    }
    public RuleType getRuleType(){
        return ruleType;
    }
    public void setRuleType(RuleType ruleType){
        this.ruleType=ruleType;
    }
    public Integer getThreshold(){
        return threshold;
    }
    public void getThreshold(Integer threshold){
        this.threshold=threshold;
    }
    public Integer getScoreImpact(){
        return scoreImpact;
    }
    public void setScoreImpact(Integer scoreImpact){
        this.scoreImpact=scoreImpact;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt=createdAt;
    }
    public RiskRule(){}
    public RiskRule(Long id,String ruleName,RuleType ruleType,Integer threshold,Integer scoreImpact,LocalDateTime createdAt){
        this.id=id;
        this.ruleName=ruleName;
        this.ruleType=ruleType;
        this.threshold=threshold;
        this.scoreImpact=scoreImpact;
        this.createdAt=createdAt;

    }
}