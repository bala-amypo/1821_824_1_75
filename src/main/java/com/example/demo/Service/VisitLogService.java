package com.example.demo.service;

import com.example.demo.entity.VisitLog;
import java.util.List;

public interface VisitLogService {
    VisitLog getById(Long id);
    VisitLog save(VisitLog log);

    // Add these methods so the controller can call them
    VisitLog create(Long visitorId, VisitLog log);
    List<VisitLog> listByVisitor(Long visitorId);
}
