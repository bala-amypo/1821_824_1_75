package com.example.demo.service.impl;

import com.example.demo.model.RiskRule;
import com.example.demo.repository.RiskRuleRepository;
import com.example.demo.service.RiskRuleService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RiskRuleServiceImpl implements RiskRuleService {

    private final RiskRuleRepository riskRuleRepository;

    public RiskRuleServiceImpl(RiskRuleRepository riskRuleRepository) {
        this.riskRuleRepository = riskRuleRepository;
    }

    @Override
    public RiskRule createRule(RiskRule rule) {
        riskRuleRepository.findByRuleName(rule.getRuleName())
                .ifPresent(r -> { throw new IllegalArgumentException("Rule name must be unique"); });

        if (rule.getThreshold() != null && rule.getThreshold() < 0) rule.setThreshold(0);
        if (rule.getScoreImpact() != null && rule.getScoreImpact() < 0) rule.setScoreImpact(0);

        return riskRuleRepository.save(rule);
    }

    @Override
    public List<RiskRule> getAllRules() {
        return riskRuleRepository.findAll();
    }

    @Override
    public RiskRule getRule(Long id) {
        return riskRuleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("RiskRule not found"));
    }
}
