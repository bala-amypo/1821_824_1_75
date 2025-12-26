package com.example.demo.service.impl;

import com.example.demo.model.RiskScore;
import com.example.demo.model.Visitor;
import com.example.demo.model.RiskRule;
import com.example.demo.repository.RiskScoreRepository;
import com.example.demo.repository.RiskRuleRepository;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.RiskScoreService;
import com.example.demo.util.RiskLevelUtils;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    private final RiskScoreRepository riskScoreRepository;
    private final VisitorRepository visitorRepository;
    private final RiskRuleRepository riskRuleRepository;

    public RiskScoreServiceImpl(RiskScoreRepository riskScoreRepository,
                                VisitorRepository visitorRepository,
                                RiskRuleRepository riskRuleRepository) {
        this.riskScoreRepository = riskScoreRepository;
        this.visitorRepository = visitorRepository;
        this.riskRuleRepository = riskRuleRepository;
    }

    @Override
    public RiskScore evaluateVisitor(Long visitorId) {
        Visitor visitor = visitorRepository.findById(visitorId)
                .orElseThrow(() -> new ResourceNotFoundException("Visitor not found with id: " + visitorId));

        List<RiskRule> rules = riskRuleRepository.findAll();

        int totalScore = rules.stream().mapToInt(RiskRule::getScoreImpact).sum();
        String riskLevel = RiskLevelUtils.determineRiskLevel(totalScore);

        RiskScore riskScore = new RiskScore();
        riskScore.setVisitor(visitor);
        riskScore.setTotalScore(totalScore);
        riskScore.setRiskLevel(riskLevel);
        riskScore.setEvaluatedAt(LocalDateTime.now());

        return riskScoreRepository.save(riskScore);
    }

    @Override
    public RiskScore getScoreForVisitor(Long visitorId) {
        return riskScoreRepository.findByVisitorId(visitorId)
                .orElseThrow(() -> new ResourceNotFoundException("RiskScore not found for visitor id: " + visitorId));
    }

    @Override
    public List<RiskScore> getAllScores() {
        return riskScoreRepository.findAll();
    }
}
