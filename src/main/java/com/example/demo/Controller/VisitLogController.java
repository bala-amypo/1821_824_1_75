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

    public ResponseEntity<VisitLog> create(Long visitorId, VisitLog log) {
        return ResponseEntity.ok(service.createVisitLog(visitorId, log));
    }

    public ResponseEntity<VisitLog> get(Long id) {
        return ResponseEntity.ok(service.getLog(id));
    }

    public ResponseEntity<List<VisitLog>> listByVisitor(Long visitorId) {
        return ResponseEntity.ok(service.getLogsByVisitor(visitorId));
    }
}
