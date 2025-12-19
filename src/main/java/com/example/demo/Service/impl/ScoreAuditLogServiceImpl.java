package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ScoreAuditLog;
import com.example.demo.repository.ScoreAuditLogRepository;
import com.example.demo.service.ScoreAuditLogService;

@Service
public class ScoreAuditLogServiceImpl implements ScoreAuditLogService {

    private final ScoreAuditLogRepository repository;

    public ScoreAuditLogServiceImpl(ScoreAuditLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public ScoreAuditLog save(ScoreAuditLog log) {
        return repository.save(log);
    }

    @Override
    public List<ScoreAuditLog> getAll() {
        return repository.findAll();
    }
}
