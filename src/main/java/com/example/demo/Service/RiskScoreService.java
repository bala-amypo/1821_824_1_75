package com.example.demo.service;

import com.example.demo.entity.RiskScore;
import java.util.List;

public interface RiskScoreService {

    List<RiskScore> listAll();

    RiskScore getById(Long id);

    RiskScore save(RiskScore score);

    // Method required by controller
    RiskScore evaluate(Long visitorId);

    // Method missing that caused compilation error
    RiskScore getByVisitor(Long visitorId);
}
