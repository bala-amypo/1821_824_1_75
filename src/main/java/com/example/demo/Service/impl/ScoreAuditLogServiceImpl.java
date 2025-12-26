// package com.example.demo.service.impl;

// import com.example.demo.entity.ScoreAuditLog;
// import com.example.demo.service.ScoreAuditLogService;
// import org.springframework.stereotype.Service;

// import java.util.ArrayList;
// import java.util.List;

// @Service
// public class ScoreAuditLogServiceImpl implements ScoreAuditLogService {

//     @Override
//     public ScoreAuditLog getById(Long id) {
//         return new ScoreAuditLog();
//     }

//     @Override
//     public ScoreAuditLog save(ScoreAuditLog log) {
//         return log;
//     }

//     @Override
//     public ScoreAuditLog create(Long visitorId, Long scoreId, ScoreAuditLog log) {
//         // Example stub: set visitorId and scoreId in log
//         log.setVisitorId(visitorId);
//         log.setScoreId(scoreId);
//         return save(log);
//     }

//     @Override
//     public List<ScoreAuditLog> listByVisitor(Long visitorId) {
//         // Example stub: return empty list
//         return new ArrayList<>();
//     }
// }
