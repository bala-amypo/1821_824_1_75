package com.example.demo.service;

import com.example.demo.entity.Visitor;
import java.util.List;

public interface VisitorService {

    Visitor saveVisitor(Visitor visitor);

    List<Visitor> getAllVisitors();

    Visitor getVisitorById(Long id);
}
