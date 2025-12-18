package com.example.demo.service;
import java.utio.List;
import com.example.demo.entity.ScoreAuditLog;
public interface ScoreAuditLogService{
    ScoreAuditLog logScoreChange(Long visitorId,Long ruleId,ScoreAuditLog log);
    List<ScoreAuditLog>getLogByVisitor(Long visitorId);
    ScoreAuditLog getLog(Long id);
}