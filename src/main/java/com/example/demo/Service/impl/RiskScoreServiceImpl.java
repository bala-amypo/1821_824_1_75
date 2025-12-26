package com.example.demo.service.impl;

import com.example.demo.model.RiskScore;
import com.example.demo.model.Visitor;
import com.example.demo.model.RiskRule;
import com.example.demo.model.ScoreAuditLog;
import com.example.demo.repository.RiskScoreRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.repository.RiskRuleRepository;
import com.example.demo.repository.ScoreAuditLogRepository;
import com.example.demo.service.RiskScoreService;
import com.example.demo.util.RiskLevelUtils;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    private final VisitorRepository visitorRepository;
    private final RiskScoreRepository riskScoreRepository;
    private final RiskRuleRepository riskRuleRepository;
    private final ScoreAuditLogRepository scoreAuditLogRepository;

    public RiskScoreServiceImpl(VisitorRepository visitorRepository,
                                RiskScoreRepository riskScoreRepository,
                                RiskRuleRepository riskRuleRepository,
                                ScoreAuditLogRepository scoreAuditLogRepository) {
        this.visitorRepository = visitorRepository;
        this.riskScoreRepository = riskScoreRepository;
        this.riskRuleRepository = riskRuleRepository;
        this.scoreAuditLogRepository = scoreAuditLogRepository;
    }

    @Override
    public RiskScore evaluateVisitor(Long visitorId) {
        Visitor visitor = visitorRepository.findById(visitorId)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));

        List<RiskRule> rules = riskRuleRepository.findAll();
        int totalScore = 0;

        for (RiskRule rule : rules) {
            // Dummy logic: apply scoreImpact if threshold > 0 (customize per real rules)
            totalScore += rule.getScoreImpact() != null ? rule.getScoreImpact() : 0;

            // Create audit log
            ScoreAuditLog log = new ScoreAuditLog();
            log.setVisitor(visitor);
            log.setAppliedRule(rule);
            log.setScoreChange(rule.getScoreImpact() != null ? rule.getScoreImpact() : 0);
            log.setReason("Rule applied");
            scoreAuditLogRepository.save(log);
        }

        RiskScore riskScore = riskScoreRepository.findByVisitorId(visitorId)
                .orElse(new RiskScore());
        riskScore.setVisitor(visitor);
        riskScore.setTotalScore(Math.max(totalScore, 0));
        riskScore.setRiskLevel(RiskLevelUtils.determineRiskLevel(riskScore.getTotalScore()));

        return riskScoreRepository.save(riskScore);
    }

    @Override
    public RiskScore getScoreForVisitor(Long visitorId) {
        return riskScoreRepository.findByVisitorId(visitorId)
                .orElseThrow(() -> new RuntimeException("RiskScore not found"));
    }

    @Override
    public List<RiskScore> getAllScores() {
        return riskScoreRepository.findAll();
    }
}
