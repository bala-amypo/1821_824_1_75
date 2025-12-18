// package com.example.demo.service.imple;

// import java.util.List;

// import org.springframework.stereotype.Service;

// import com.example.demo.entity.RiskRule;
// import com.example.demo.repository.RiskRuleRepository;
// import com.example.demo.service.RiskRuleService;

// @Service
// public class RiskRuleServiceImple implements RiskRuleService {

//     private final RiskRuleRepository riskRuleRepository;

//     public RiskRuleServiceImple(RiskRuleRepository riskRuleRepository) {
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