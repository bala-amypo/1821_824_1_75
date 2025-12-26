package com.example.demo.controller;

import com.example.demo.model.RiskRule;
import com.example.demo.service.RiskRuleService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/risk-rules")
public class RiskRuleController {

    private final RiskRuleService service;

    public RiskRuleController(RiskRuleService service) {
        this.service = service;
    }

    public ResponseEntity<RiskRule> create(RiskRule rule) {
        return ResponseEntity.ok(service.createRule(rule));
    }

    public ResponseEntity<RiskRule> get(Long id) {
        return ResponseEntity.ok(service.getRule(id));
    }

    public ResponseEntity<List<RiskRule>> all() {
        return ResponseEntity.ok(service.getAllRules());
    }
}
