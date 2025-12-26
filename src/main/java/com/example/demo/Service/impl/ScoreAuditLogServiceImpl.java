package com.example.demo.service.impl;

import com.example.demo.entity.ScoreAuditLog;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreAuditLogServiceImpl implements ScoreAuditLogService {

    @Override
    public List<ScoreAuditLog> getAll() {
        return List.of();
    }

    @Override
    public ScoreAuditLog getById(Long id) {
        return null;
    }
}
