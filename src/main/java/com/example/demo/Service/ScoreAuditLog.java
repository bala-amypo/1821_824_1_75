package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.ScoreAuditLog;
public interface ScoreAuditLog{
    ScoreAuditLog logScoreChange(Long visitorId,Long ruleId,ScoreAuditLog log);
    List<ScoreAuditLog>getLogByVisitor(Long visitorId);
    ScoreAuditLog getLog(Long id);
}