package com.example.demo.service;

import com.example.demo.entity.VisitLog;
import java.util.List;

public interface VisitLogService {
    List<VisitLog> getAll();
    VisitLog getById(Long id);
}
