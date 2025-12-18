package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.RiskScoreService;
public interface RiskScoreService{
    RiskScore evaluatedVisitor(Long visitorId);
    RiskScore getScoreForVisitor(Long visitorId);
    List<RiskScoreService>getAllScores();
}