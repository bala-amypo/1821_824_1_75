package com.example.demo.controller;

import com.example.demo.entity.Visitor;
import com.example.demo.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitors")
public class VisitorController {

    @Autowired
    private VisitorRepository visitorRepository;

    // POST /api/visitors
    @PostMapping
    public Visitor createVisitor(@RequestBody Visitor visitor) {
        return visitorRepository.save(visitor);
    }

    // GET /api/visitors
    @GetMapping
    public List<Visitor> getAllVisitors() {
        return visitorRepository.findAll();
    }

    // GET /api/visitors/{id}
    @GetMapping("/{id}")
    public Visitor getVisitor(@PathVariable Long id) {
        return visitorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Visitor not found"));
    }
}
