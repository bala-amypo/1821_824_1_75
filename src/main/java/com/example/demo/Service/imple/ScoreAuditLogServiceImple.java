package com.example.demo.service.impl;

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
    public ScoreAuditLog logScoreChange(Long visitorId, Long ruleId, ScoreAuditLog log) {
        log.setVisitorId(visitorId);
        log.setRuleId(ruleId);
        return repository.save(log);
    }
}