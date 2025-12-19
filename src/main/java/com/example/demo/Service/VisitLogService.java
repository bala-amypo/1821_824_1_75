package com.example.demo.service;

import com.example.demo.entity.VisitLog;

public interface VisitLogService {
    VisitLog getById(Long id);
    VisitLog save(VisitLog log);
}
