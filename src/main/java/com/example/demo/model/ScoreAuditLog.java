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
    private Integer scoreChange;
    private String reason;
    private LocalDateTime loggedAt;
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Integer getScoreChange(){
        return scoreChange;
    }
    public void setScoreChange(Integer scoreChange){
        this.scoreChange=scoreChange;
    }
    public String getReason(){
        return reason;
    }
    public void setReason(String reason){
        this.reason=reason;
    }
    public LocalDateTime getLoggedAt(){
        return loggedAt;
    }
    public void setLoggedAt(LocalDateTime loggedAt){
        this.loggedAt=loggedAt;
    }
public ScoreAuditLog(Long id,Integer scoreChange,String reason,LocalDateTime loggedAt){
    this.id=id;
    this.scoreChange=scoreChange;
    this.reason=reason;
    this.loggedAt=loggedAt;
}
public ScoreAuditLog(){}

}