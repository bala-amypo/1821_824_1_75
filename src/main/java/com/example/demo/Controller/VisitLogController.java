package com.example.demo.controller;

import com.example.demo.model.VisitLog;
import com.example.demo.service.VisitLogService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visit-logs")
public class VisitLogController {

    private final VisitLogService service;

    public VisitLogController(VisitLogService service) {
        this.service = service;
    }

    @PostMapping("/{visitorId}")
    public ResponseEntity<VisitLog> create(
            @PathVariable Long visitorId,
            @RequestBody VisitLog log) {
        return ResponseEntity.ok(service.createVisitLog(visitorId, log));
    }

    @GetMapping("/visitor/{visitorId}")
    public ResponseEntity<List<VisitLog>> byVisitor(@PathVariable Long visitorId) {
        return ResponseEntity.ok(service.getLogsByVisitor(visitorId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<VisitLog> get(@PathVariable Long id) {
        return ResponseEntity.ok(service.getLog(id));
    }
}
