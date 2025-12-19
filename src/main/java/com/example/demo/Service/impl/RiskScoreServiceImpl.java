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
        // Replace with real DB logic
        return new ArrayList<>();
    }

    @Override
    public RiskScore getById(Long id) {
        // Replace with real DB logic
        return new RiskScore();
    }

    @Override
    public RiskScore save(RiskScore score) {
        // Replace with real DB save logic
        return score;
    }
}
