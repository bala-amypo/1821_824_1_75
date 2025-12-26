package com.example.demo.service.impl;

import com.example.demo.model.RiskScore;
import com.example.demo.repository.RiskScoreRepository;
import com.example.demo.service.RiskScoreService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    private final RiskScoreRepository riskScoreRepository;

    public RiskScoreServiceImpl(RiskScoreRepository riskScoreRepository) {
        this.riskScoreRepository = riskScoreRepository;
    }

    @Override
    public RiskScore evaluateVisitor(Long visitorId) {
        // Simulate evaluation logic
        RiskScore score = riskScoreRepository.findByVisitorId(visitorId)
                .orElse(RiskScore.builder().visitorId(visitorId).totalScore(0).riskLevel("LOW").build());
        return score;
    }

    @Override
    public RiskScore getScoreForVisitor(Long visitorId) {
        return riskScoreRepository.findByVisitorId(visitorId)
                .orElse(RiskScore.builder().visitorId(visitorId).totalScore(0).riskLevel("LOW").build());
    }

    @Override
    public List<RiskScore> getAllScores() {
        return riskScoreRepository.findAll();
    }
}
