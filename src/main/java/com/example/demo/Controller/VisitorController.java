package com.example.demo.controller;

import com.example.demo.entity.Visitor;
import com.example.demo.service.VisitorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/visitors")
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    // POST /api/visitors
    @PostMapping
    public Visitor createVisitor(@RequestBody Visitor visitor) {
        return visitorService.saveVisitor(visitor);
    }

    // GET /api/visitors
    @GetMapping
    public List<Visitor> getAllVisitors() {
        return visitorService.getAllVisitors();
    }

    // GET /api/visitors/{id}
    @GetMapping("/{id}")
    public Visitor getVisitor(@PathVariable Long id) {
        return visitorService.getVisitorById(id);
    }
}
