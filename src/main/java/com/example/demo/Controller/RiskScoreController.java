// package com.example.demo.controller;

// import com.example.demo.entity.RiskScore;
// import com.example.demo.service.RiskScoreService;

// import java.util.List;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;

// @RestController
// @RequestMapping("/api/risk-scores")
// public class RiskScoreController {

//     private final RiskScoreService riskScoreService;

//     public RiskScoreController(RiskScoreService riskScoreService) {
//         this.riskScoreService = riskScoreService;
//     }

//     @PostMapping("/evaluate/{visitorId}")
//     public RiskScore evaluateVisitor(@PathVariable Long visitorId) {
//         return riskScoreService.evaluate(visitorId);
//     }

//     @GetMapping("/{visitorId}")
//     public RiskScore getScoreForVisitor(@PathVariable Long visitorId) {
//         return riskScoreService.getByVisitor(visitorId);
//     }

//     @GetMapping
//     public List<RiskScore> listAllScores() {
//         return riskScoreService.listAll();
//     }
// }
