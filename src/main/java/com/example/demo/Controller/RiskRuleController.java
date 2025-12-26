// package com.example.demo.controller;

// import com.example.demo.entity.RiskRule;
// import com.example.demo.service.RiskRuleService;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/risk-rules")
// public class RiskRuleController {

//     private final RiskRuleService service;

//     public RiskRuleController(RiskRuleService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public RiskRule create(@RequestBody RiskRule rule) {
//         return service.create(rule);
//     }

//     @GetMapping
//     public List<RiskRule> getAll() {
//         return service.getAll();
//     }
// }
