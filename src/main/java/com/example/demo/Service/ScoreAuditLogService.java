package com.example.demo.service;

import com.example.demo.entity.ScoreAuditLog;
import java.util.List;

public interface ScoreAuditLogService {
    List<ScoreAuditLog> getAll();
    ScoreAuditLog getById(Long id);
}
