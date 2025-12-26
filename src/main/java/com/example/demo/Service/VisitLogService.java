package com.example.demo.service;

import com.example.demo.entity.VisitLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitLogService {

    public List<VisitLog> getAll() {
        return List.of();
    }

    public VisitLog getById(Long id) {
        return null;
    }
}
