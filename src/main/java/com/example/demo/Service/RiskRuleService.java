package com.example.demo.service;
import java.utio.List;
import com.example.demo.entity.Visitor;
public interface VisirService{
    Visitor createVisitor(Visitor visitor);
    Visitor getVisitor(Long id);
    List<Visitor>getAllVisitors();
}