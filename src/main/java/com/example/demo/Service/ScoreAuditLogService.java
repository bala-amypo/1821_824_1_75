package com.example.demo.service;

import com.example.demo.entity.ScoreAuditLog;
import java.util.List;

public interface ScoreAuditLogService {
    ScoreAuditLog create(Long visitorId, Long ruleId, ScoreAuditLog log);
    List<ScoreAuditLog> listByVisitor(Long visitorId);
    ScoreAuditLog getById(Long id);
}
