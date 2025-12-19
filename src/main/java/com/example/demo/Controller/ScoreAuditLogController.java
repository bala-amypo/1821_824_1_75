// package com.example.demo.controller;

// import com.example.demo.entity.ScoreAuditLog;
// import com.example.demo.service.ScoreAuditLogService;

// import java.util.List;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;

// @RestController
// @RequestMapping("/api/score-logs")
// public class ScoreAuditLogController {

//     private final ScoreAuditLogService scoreAuditLogService;

//     public ScoreAuditLogController(ScoreAuditLogService scoreAuditLogService) {
//         this.scoreAuditLogService = scoreAuditLogService;
//     }

//     @PostMapping("/{visitorId}/{ruleId}")
//     public ScoreAuditLog createAuditLog(@PathVariable Long visitorId, @PathVariable Long ruleId, @RequestBody ScoreAuditLog log) {
//         return scoreAuditLogService.create(visitorId, ruleId, log);
//     }

//     @GetMapping("/visitor/{visitorId}")
//     public List<ScoreAuditLog> listLogsForVisitor(@PathVariable Long visitorId) {
//         return scoreAuditLogService.listByVisitor(visitorId);
//     }

//     @GetMapping("/{id}")
//     public ScoreAuditLog getLog(@PathVariable Long id) {
//         return scoreAuditLogService.getById(id);
//     }
// }
