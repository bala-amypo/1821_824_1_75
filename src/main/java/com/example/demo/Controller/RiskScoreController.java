package com.example.demo.controller;

import com.example.demo.entity.RiskScore;
import com.example.demo.service.RiskScoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/risk-scores")
public class RiskScoreController {

    private final RiskScoreService service;

    public RiskScoreController(RiskScoreService service) {
        this.service = service;
    }

    @PostMapping("/evaluate/{visitorId}")
    public ResponseEntity<RiskScore> evaluateVisitor(@PathVariable Long visitorId) {
        RiskScore riskScore = service.evaluateVisitor(visitorId);
        return ResponseEntity.ok(riskScore);
    }

    @GetMapping("/{visitorId}")
    public ResponseEntity<RiskScore> getScore(@PathVariable Long visitorId) {
        RiskScore riskScore = service.getScoreByVisitorId(visitorId);
        if (riskScore == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(riskScore);
    }

    @GetMapping
    public ResponseEntity<List<RiskScore>> getAllScores() {
        return ResponseEntity.ok(service.getAllScores());
    }
}
