package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.VisitLog;
import com.example.demo.service.VisitLogService;

import java.util.List;

@RestController
@RequestMapping("/visit-logs")
public class VisitLogController {

    private final VisitLogService visitLogService;

    public VisitLogController(VisitLogService visitLogService) {
        this.visitLogService = visitLogService;
    }

    @PostMapping("/{visitorId}")
    public ResponseEntity<VisitLog> create(@PathVariable Long visitorId, @RequestBody VisitLog log) {
        return ResponseEntity.ok(visitLogService.createVisitLog(visitorId, log));
    }

    @GetMapping("/{id}")
    public ResponseEntity<VisitLog> get(@PathVariable Long id) {
        return ResponseEntity.ok(visitLogService.getLog(id));
    }

    @GetMapping("/visitor/{visitorId}")
    public ResponseEntity<List<VisitLog>> listByVisitor(@PathVariable Long visitorId) {
        return ResponseEntity.ok(visitLogService.getLogsByVisitor(visitorId));
    }
}
