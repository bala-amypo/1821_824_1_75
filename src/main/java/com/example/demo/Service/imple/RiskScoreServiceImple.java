package com.example.demo.service.imple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.RiskScore;
import com.example.demo.repository.RiskScoreRepository;
import com.example.demo.service.RiskScoreService;

@Service
public class RiskScoreServiceImple implements RiskScoreService {

    private final RiskScoreRepository riskScoreRepository;

    public RiskScoreServiceImple(RiskScoreRepository riskScoreRepository) {
        this.riskScoreRepository = riskScoreRepository;
    }

    @Override
    public RiskScore evaluateVisitor(Long visitorId) {
        RiskScore score = new RiskScore();
        score.setVisitorId(visitorId);
        score.setScore(50); // sample logic
        return riskScoreRepository.save(score);
    }

    @Override
    public RiskScore getScoreForVisitor(Long visitorId) {
        return riskScoreRepository.findByVisitorId(visitorId);
    }

    @Override
    public List<RiskScore> getAllScores() {
        return riskScoreRepository.findAll();
    }
}