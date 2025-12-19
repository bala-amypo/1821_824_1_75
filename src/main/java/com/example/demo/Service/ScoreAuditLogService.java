package com.example.demo.service;

import com.example.demo.entity.ScoreAuditLog;
import java.util.List;

public interface ScoreAuditLogService {

    ScoreAuditLog save(ScoreAuditLog log);

    List<ScoreAuditLog> getAll();
}
