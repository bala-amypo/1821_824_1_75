// package com.example.demo.service.impl;

// import java.util.List;

// import org.springframework.stereotype.Service;

// import com.example.demo.entity.RiskRule;
// import com.example.demo.repository.RiskRuleRepository;
// import com.example.demo.service.RiskRuleService;

// @Service
// public class RiskRuleServiceImpl implements RiskRuleService {

//     private final RiskRuleRepository riskRuleRepository;

//     public RiskRuleServiceImpl(RiskRuleRepository riskRuleRepository) {
//         this.riskRuleRepository = riskRuleRepository;
//     }

//     @Override
//     public RiskRule createRule(RiskRule rule) {
//         return riskRuleRepository.save(rule);
//     }

//     @Override
//     public List<RiskRule> getAllRules() {
//         return riskRuleRepository.findAll();
//     }

//     @Override
//     public RiskRule getRule(Long id) {
//         return riskRuleRepository.findById(id).orElse(null);
//     }
// }