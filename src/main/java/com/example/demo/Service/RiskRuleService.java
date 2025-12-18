package com.example.demo.service;
import java.utio.List;
import com.example.demo.entity.RiskRule;
public interface RiskRuleService{
    RiskRule createRule(RiskRule Rule);
    List<RiskRule>getAllRules();
    RiskRule getRule(Long id);
}