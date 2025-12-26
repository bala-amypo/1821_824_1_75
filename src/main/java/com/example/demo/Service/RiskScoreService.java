package com.example.demo.service;

import com.example.demo.entity.RiskScore;
import java.util.List;

public interface RiskScoreService {
    List<RiskScore> getAll();
    RiskScore getById(Long id);
}
