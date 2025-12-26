package com.example.demo.service.impl;

import com.example.demo.entity.RiskScore;
import com.example.demo.entity.RiskRule;
import com.example.demo.entity.Visitor;
import com.example.demo.repository.RiskScoreRepository;
import com.example.demo.repository.RiskRuleRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.RiskScoreService;
import com.example.demo.util.RiskLevelUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    private final RiskScoreRepository riskScoreRepository;
    private final RiskRuleRepository riskRuleRepository;
    private final VisitorRepository visitorRepository;

    public RiskScoreServiceImpl(RiskScoreRepository riskScoreRepository,
                                RiskRuleRepository riskRuleRepository,
                                VisitorRepository visitorRepository) {
        this.riskScoreRepository = riskScoreRepository;
        this.riskRuleRepository = riskRuleRepository;
        this.visitorRepository = visitorRepository;
    }

    @Override
    public RiskScore evaluateVisitor(Long visitorId) {
        Visitor visitor = visitorRepository.findById(visitorId)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));

        // Fetch all rules
        List<RiskRule> rules = riskRuleRepository.findAll();

        int totalScore = 0;
        for (RiskRule rule : rules) {
            // Simplified: add scoreImpact to totalScore (you can implement your logic)
            totalScore += rule.getScoreImpact() != null ? rule.getScoreImpact() : 0;
        }

        // Create RiskScore manually without builder
        RiskScore riskScore = new RiskScore();
        riskScore.setVisitor(visitor);
        riskScore.setTotalScore(totalScore);
        riskScore.setRiskLevel(RiskLevelUtils.determineRiskLevel(totalScore));

        // Save and return
        return riskScoreRepository.save(riskScore);
    }

    @Override
    public RiskScore getScoreForVisitor(Long visitorId) {
        return riskScoreRepository.findByVisitorId(visitorId)
                .orElseGet(() -> {
                    RiskScore rs = new RiskScore();
                    rs.setVisitor(visitorRepository.findById(visitorId).orElse(null));
                    rs.setTotalScore(0);
                    rs.setRiskLevel("LOW");
                    return rs;
                });
    }

    @Override
    public List<RiskScore> getAllScores() {
        return riskScoreRepository.findAll();
    }
}
