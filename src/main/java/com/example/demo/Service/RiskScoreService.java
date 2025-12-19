package com.example.demo.service;

import com.example.demo.entity.RiskScore;
import java.util.List;

public interface RiskScoreService {

    RiskScore evaluateVisitor(Long visitorId);

    RiskScore getScoreByVisitorId(Long visitorId);

    List<RiskScore> getAllScores();
}
