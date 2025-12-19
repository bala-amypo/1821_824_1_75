package com.example.demo.service.impl;

import com.example.demo.entity.VisitLog;
import com.example.demo.service.VisitLogService;
import org.springframework.stereotype.Service;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    @Override
    public VisitLog getById(Long id) {
        return new VisitLog();
    }

    @Override
    public VisitLog save(VisitLog log) {
        return log;
    }
}
