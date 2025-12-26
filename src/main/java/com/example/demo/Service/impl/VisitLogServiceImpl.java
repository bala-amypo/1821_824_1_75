package com.example.demo.service.impl;

import com.example.demo.entity.VisitLog;
import com.example.demo.service.VisitLogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    @Override
    public List<VisitLog> getAll() {
        return List.of();
    }

    @Override
    public VisitLog getById(Long id) {
        return null;
    }
}
