package com.example.demao.entity;

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
    private LocaDateTime;
    public enum RuleType{
        AFTER_HOURS
        FREQUENT_VISITS
        BLACKLISK
        KEYWORD
        CUSTOM
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getRuleName(){
        return rulename;
    }
    public void setRuleName(String ruleName){
        this.ruleName=ruleName
    }
}