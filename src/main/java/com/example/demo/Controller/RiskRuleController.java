package com.example.demo.controller;

import com.example.demo.entity.RiskScore;
import com.example.demo.service.RiskScoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/risk-rules")
public class RiskRuleController {

    private final RiskScoreService riskScoreService;

    public RiskRuleController(RiskScoreService riskScoreService) {
        this.riskScoreService = riskScoreService;
    }

    @PostMapping("/evaluate/{visitorId}")
    public RiskScore evaluateVisitor(@PathVariable Long visitorId) {
        return riskScoreService.evaluateVisitor(visitorId);
    }

    @GetMapping("/{visitorId}")
    public RiskScore getScoreForVisitor(@PathVariable Long visitorId) {
        return riskScoreService.getScoreForVisitor(visitorId);
    }

    @GetMapping
    public List<RiskScore> getAllScores() {
        return riskScoreService.getAllScores();
    }
}
