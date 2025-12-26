package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.service.ScoreAuditLogService;

import java.util.List;

@RestController
@RequestMapping("/score-audit-logs")
public class ScoreAuditLogController {

    private final ScoreAuditLogService service;

    public ScoreAuditLogController(ScoreAuditLogService service) {
        this.service = service;
    }

    @PostMapping("/{visitorId}/{ruleId}")
    public ResponseEntity<ScoreAuditLog> create(@PathVariable Long visitorId,
                                                @PathVariable Long ruleId,
                                                @RequestBody ScoreAuditLog log) {
        return ResponseEntity.ok(service.logScoreChange(visitorId, ruleId, log));
    }

    @GetMapping("/visitor/{visitorId}")
    public ResponseEntity<List<ScoreAuditLog>> logsByVisitor(@PathVariable Long visitorId) {
        return ResponseEntity.ok(service.getLogsByVisitor(visitorId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScoreAuditLog> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getLog(id));
    }
}
