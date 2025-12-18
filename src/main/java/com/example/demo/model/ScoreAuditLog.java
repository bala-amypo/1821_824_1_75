package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
public class ScoreAuditLog{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private integer scoreChange;
    private String reason;
    private LocalDateTime loggedAt;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public getScoreChange(){
        return scoreChenge;
    }
    public void setScoreChange(integer scoreChenge){
        this.scoreChenge=scoreChenge;
    }
    public getReason(){
        return reason;
    }
    public void setReason(String reason){
        this.reason=reason;
    }
    public LocalDateTime

}