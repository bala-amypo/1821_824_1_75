package com.example.demo.service;

import com.example.demo.entity.RiskScore;

public interface RiskScoreService {

    RiskScore calculateScore(Long visitorId, int score);

    RiskScore getByVisitorId(Long visitorId);
}
