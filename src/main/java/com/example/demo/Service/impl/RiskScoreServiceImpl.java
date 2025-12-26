package com.example.demo.service.impl;

import com.example.demo.entity.RiskScore;
import com.example.demo.service.RiskScoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskScoreServiceImpl implements RiskScoreService {

    @Override
    public List<RiskScore> getAll() {
        return List.of();
    }

    @Override
    public RiskScore getById(Long id) {
        return null;
    }
}
