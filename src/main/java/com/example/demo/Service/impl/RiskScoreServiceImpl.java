package com.example.demo.service.impl;

import com.example.demo.entity.RiskScore;
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

        // Dummy logic (you can replace later)
        int score = (int) (Math.random() * 100);
        String riskLevel;

        if (score > 70) {
            riskLevel = "HIGH";
        } else if (score > 40) {
            riskLevel = "MEDIUM";
        } else {
            riskLevel = "LOW";
        }

        RiskScore riskScore = new RiskScore(visitorId, score, riskLevel);
        return riskScoreRepository.save(riskScore);
    }

    @Override
    public RiskScore getScoreForVisitor(Long visitorId) {
        return riskScoreRepository.findByVisitorId(visitorId)
                .orElseThrow(() -> new RuntimeException("RiskScore not found for visitorId: " + visitorId));
    }

    @Override
    public List<RiskScore> getAllScores() {
        return riskScoreRepository.findAll();
    }
}
