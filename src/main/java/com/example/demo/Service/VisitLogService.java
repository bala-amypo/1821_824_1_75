package com.example.demo.service;
import java.utio.List;
import com.example.demo.entity.VisitLog;
public interface VisitLogService{
    VisitLog createVisitLog(Long VisitorId visitLog log);
    VisitLog getLog(Long id);
    List<VisitLog>getLogsByVisitor(Long visitorId);
}