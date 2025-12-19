package com.example.demo.service;

import com.example.demo.entity.ScoreAuditLog;
import java.util.List;

public interface ScoreAuditLogService {

    ScoreAuditLog getById(Long id);
    ScoreAuditLog save(ScoreAuditLog log);

    // Add these methods to match the controller calls
    ScoreAuditLog create(Long visitorId, Long scoreId, ScoreAuditLog log);
    List<ScoreAuditLog> listByVisitor(Long visitorId);
}
