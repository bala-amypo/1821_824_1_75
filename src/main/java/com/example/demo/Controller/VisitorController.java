// package com.example.demo.controller;

// import com.example.demo.model.Visitor;
// import com.example.demo.service.VisitorService;
// import io.swagger.v3.oas.annotations.tags.Tag;
// import org.springframework.http.*;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/visitors")
// @Tag(name = "Visitor")
// public class VisitorController {

//     private final VisitorService service;

//     public VisitorController(VisitorService service) {
//         this.service = service;
//     }

//     public ResponseEntity<Visitor> create(@RequestBody Visitor v) {
//         return ResponseEntity.ok(service.createVisitor(v));
//     }

//     public ResponseEntity<Visitor> get(@PathVariable Long id) {
//         return ResponseEntity.ok(service.getVisitor(id));
//     }

//     public ResponseEntity<List<Visitor>> all() {
//         return ResponseEntity.ok(service.getAllVisitors());
//     }
// }
