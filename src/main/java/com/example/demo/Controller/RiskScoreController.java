package com.example.demo.controller;

import com.example.demo.entity.RiskScore;
import com.example.demo.repository.RiskScoreRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/risk-scores")
@Tag(name = "Risk Score API", description = "Risk score calculation APIs")
@SecurityRequirement(name = "BearerAuth")
public class RiskScoreController {

    private final RiskScoreRepository riskScoreRepository;

    public RiskScoreController(RiskScoreRepository riskScoreRepository) {
        this.riskScoreRepository = riskScoreRepository;
    }

    @GetMapping("/{visitorId}")
    public ResponseEntity<?> getRiskScore(@PathVariable Long visitorId) {

        Optional<RiskScore> riskScore =
                riskScoreRepository.findByVisitorId(visitorId);

        if (riskScore.isEmpty()) {
            return ResponseEntity
                    .status(404)
                    .body("Risk score not found for visitorId: " + visitorId);
        }

        return ResponseEntity.ok(riskScore.get());
    }
}
