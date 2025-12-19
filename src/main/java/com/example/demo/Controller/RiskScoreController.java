package com.example.demo.controller;

import com.example.demo.entity.RiskScore;
import com.example.demo.service.RiskScoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/risk-scores")
public class RiskScoreController {

    private final RiskScoreService riskScoreService;

    public RiskScoreController(RiskScoreService riskScoreService) {
        this.riskScoreService = riskScoreService;
    }

    // POST /evaluate/{visitorId} — evaluate visitor and create a risk score
    @PostMapping("/evaluate/{visitorId}")
    public RiskScore evaluateVisitor(@PathVariable Long visitorId) {
        return riskScoreService.evaluate(visitorId);
    }

    // GET /{visitorId} — get risk score for a specific visitor
    @GetMapping("/{visitorId}")
    public RiskScore getScoreForVisitor(@PathVariable Long visitorId) {
        return riskScoreService.getByVisitor(visitorId);
    }

    // GET / — list all risk scores
    @GetMapping
    public List<RiskScore> listAllScores() {
        return riskScoreService.listAll();
    }
}
