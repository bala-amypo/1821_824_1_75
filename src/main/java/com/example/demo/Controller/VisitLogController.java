package com.example.demo.controller;

import com.example.demo.entity.VisitLog;
import com.example.demo.service.VisitLogService;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/visit-logs")
public class VisitLogController {

    private final VisitLogService visitLogService;

    public VisitLogController(VisitLogService visitLogService) {
        this.visitLogService = visitLogService;
    }

    @PostMapping("/{visitorId}")
    public VisitLog createVisitLog(@PathVariable Long visitorId, @RequestBody VisitLog log) {
        return visitLogService.create(visitorId, log);
    }

    @GetMapping("/visitor/{visitorId}")
    public List<VisitLog> listLogsForVisitor(@PathVariable Long visitorId) {
        return visitLogService.listByVisitor(visitorId);
    }

    @GetMapping("/{id}")
    public VisitLog getLog(@PathVariable Long id) {
        return visitLogService.getById(id);
    }
}
