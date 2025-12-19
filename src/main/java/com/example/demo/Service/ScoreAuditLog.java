package com.example.demo.service;
import com.example.demo.entity.ScoreAuditLog;
public interface ScoreAuditLog{
    ScoreAuditLog logScoreChange(Long visitorId,Long ruleId,ScoreAuditLog log);
    
}