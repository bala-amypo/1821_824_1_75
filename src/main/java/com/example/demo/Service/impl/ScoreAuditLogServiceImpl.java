package com.example.demo.service.impl;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.model.Visitor;
import com.example.demo.model.RiskRule;
import com.example.demo.repository.ScoreAuditLogRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.repository.RiskRuleRepository;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ScoreAuditLogServiceImpl implements ScoreAuditLogService {

    private final ScoreAuditLogRepository scoreAuditLogRepository;
    private final VisitorRepository visitorRepository;
    private final RiskRuleRepository riskRuleRepository;

    public ScoreAuditLogServiceImpl(ScoreAuditLogRepository scoreAuditLogRepository,
                                    VisitorRepository visitorRepository,
                                    RiskRuleRepository riskRuleRepository) {
        this.scoreAuditLogRepository = scoreAuditLogRepository;
        this.visitorRepository = visitorRepository;
        this.riskRuleRepository = riskRuleRepository;
    }

    @Override
    public ScoreAuditLog logScoreChange(Long visitorId, Long ruleId, ScoreAuditLog log) {
        Visitor visitor = visitorRepository.findById(visitorId)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));
        RiskRule rule = riskRuleRepository.findById(ruleId)
                .orElseThrow(() -> new RuntimeException("RiskRule not found"));

        log.setVisitor(visitor);
        log.setAppliedRule(rule);

        if (log.getReason() == null || log.getReason().isBlank()) {
            throw new IllegalArgumentException("reason required");
        }
        if (log.getScoreChange() == null || log.getScoreChange() < 0) {
            log.setScoreChange(0);
        }

        return scoreAuditLogRepository.save(log);
    }

    @Override
    public List<ScoreAuditLog> getLogsByVisitor(Long visitorId) {
        return scoreAuditLogRepository.findByVisitorId(visitorId);
    }

    @Override
    public ScoreAuditLog getLog(Long id) {
        return scoreAuditLogRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ScoreAuditLog not found"));
    }
}
