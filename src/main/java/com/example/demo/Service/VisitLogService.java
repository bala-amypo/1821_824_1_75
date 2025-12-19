package com.example.demo.service;

import com.example.demo.entity.VisitLog;
import java.util.List;

public interface VisitLogService {

    VisitLog save(VisitLog visitLog);

    VisitLog findById(Long id);

    List<VisitLog> findAll();
}
