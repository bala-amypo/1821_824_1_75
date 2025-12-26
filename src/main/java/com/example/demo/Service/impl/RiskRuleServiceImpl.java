// package com.example.demo.service.impl;

// import com.example.demo.entity.RiskRule;
// import com.example.demo.repository.RiskRuleRepository;
// import com.example.demo.service.RiskRuleService;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class RiskRuleServiceImpl implements RiskRuleService {

//     private final RiskRuleRepository repository;

//     public RiskRuleServiceImpl(RiskRuleRepository repository) {
//         this.repository = repository;
//     }

//     @Override
//     public RiskRule create(RiskRule rule) {
//         return repository.save(rule);
//     }

//     @Override
//     public List<RiskRule> getAll() {
//         return repository.findAll();
//     }

//     @Override
//     public RiskRule getById(Long id) {
//         return repository.findById(id).orElseThrow();
//     }
// }
