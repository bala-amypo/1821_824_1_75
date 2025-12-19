package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.RiskScore;
import com.example.demo.repository.RiskScoreRepository;
import com.example.demo.service.RiskScoreService;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    private final RiskScoreRepository riskScoreRepository;

    public RiskScoreServiceImpl(RiskScoreRepository riskScoreRepository) {
        this.riskScoreRepository = riskScoreRepository;
    }

    @Override
    public RiskScore calculateScore(Long visitorId, int scoreValue) {
        RiskScore score = new RiskScore();
        score.setVisitorId(visitorId);
        score.setScore(scoreValue);
        return riskScoreRepository.save(score);
    }

    @Override
    public RiskScore getByVisitorId(Long visitorId) {
        return riskScoreRepository.findByVisitorId(visitorId).orElse(null);
    }
}
