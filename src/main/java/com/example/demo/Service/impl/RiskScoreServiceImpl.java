package com.example.demo.service.impl;

import com.example.demo.entity.RiskScore;
import com.example.demo.service.RiskScoreService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    @Override
    public List<RiskScore> listAll() {
        return new ArrayList<>(); // Replace with DB logic
    }

    @Override
    public RiskScore getById(Long id) {
        return new RiskScore(); // Replace with DB logic
    }

    @Override
    public RiskScore save(RiskScore score) {
        return score; // Replace with DB save
    }

    @Override
    public RiskScore evaluate(Long visitorId) {
        // Example stub: calculate risk score
        RiskScore score = new RiskScore();
        score.setVisitorId(visitorId);
        return score;
    }

    @Override
    public RiskScore getByVisitor(Long visitorId) {
        // Example stub: fetch risk score by visitor
        RiskScore score = new RiskScore();
        score.setVisitorId(visitorId);
        return score;
    }
}
