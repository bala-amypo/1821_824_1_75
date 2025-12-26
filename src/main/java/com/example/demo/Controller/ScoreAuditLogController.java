package com.example.demo.controller;

import com.example.demo.model.ScoreAuditLog;
import com.example.demo.service.ScoreAuditLogService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/score-logs")
public class ScoreAuditLogController {

    private final ScoreAuditLogService service;

    public ScoreAuditLogController(ScoreAuditLogService service) {
        this.service = service;
    }

    @PostMapping("/{visitorId}/{ruleId}")
    public ResponseEntity<ScoreAuditLog> create(
            @PathVariable Long visitorId,
            @PathVariable Long ruleId,
            @RequestBody ScoreAuditLog log) {
        return ResponseEntity.ok(service.logScoreChange(visitorId, ruleId, log));
    }

    @GetMapping("/visitor/{visitorId}")
    public ResponseEntity<List<ScoreAuditLog>> byVisitor(@PathVariable Long visitorId) {
        return ResponseEntity.ok(service.getLogsByVisitor(visitorId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScoreAuditLog> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getLog(id));
    }
}
