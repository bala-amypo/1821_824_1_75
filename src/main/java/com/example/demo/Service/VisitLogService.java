package com.example.demo.service;

import com.example.demo.entity.VisitLog;
import java.util.List;

public interface VisitLogService {
    VisitLog create(Long visitorId, VisitLog log);
    List<VisitLog> listByVisitor(Long visitorId);
    VisitLog getById(Long id);
}
