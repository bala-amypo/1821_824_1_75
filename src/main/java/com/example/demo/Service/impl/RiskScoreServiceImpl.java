package com.example.demo.service;

import com.example.demo.entity.RiskScore;
import com.example.demo.repository.RiskScoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    private final RiskScoreRepository repository;
    private final Random random = new Random();

    public RiskScoreServiceImpl(RiskScoreRepository repository) {
        this.repository = repository;
    }

    @Override
    public RiskScore evaluateVisitor(Long visitorId) {
        // Example scoring logic
        int score = random.nextInt(101); // 0-100

        RiskScore.RiskLevel level;
        if (score < 25) level = RiskScore.RiskLevel.LOW;
        else if (score < 50) level = RiskScore.RiskLevel.MEDIUM;
        else if (score < 75) level = RiskScore.RiskLevel.HIGH;
        else level = RiskScore.RiskLevel.CRITICAL;

        RiskScore riskScore = repository.findByVisitorId(visitorId)
                .orElse(new RiskScore(visitorId, score, level));

        riskScore.setTotalScore(score);
        riskScore.setRiskLevel(level);
        repository.save(riskScore);

        return riskScore;
    }

    @Override
    public RiskScore getScoreByVisitorId(Long visitorId) {
        return repository.findByVisitorId(visitorId)
                .orElse(null);
    }

    @Override
    public List<RiskScore> getAllScores() {
        return repository.findAll();
    }
}
