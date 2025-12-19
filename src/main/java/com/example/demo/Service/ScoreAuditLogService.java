package com.example.demo.service;

import com.example.demo.entity.ScoreAuditLog;

public interface ScoreAuditLogService {
    ScoreAuditLog getById(Long id);
    ScoreAuditLog save(ScoreAuditLog log);
}
