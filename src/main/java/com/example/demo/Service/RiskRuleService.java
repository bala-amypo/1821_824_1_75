package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.RiskRuleService;
public interface RiskRuleService{
    RiskRule createRule(RiskRule Rule);
    List<RiskRuleService>getAllRules();
    RiskRule getRule(Long id);
}