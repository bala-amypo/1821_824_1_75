package com.example.demo.service;
import com.example.demo.entity.User;
public interface User{
    Visitor createVisitor(Visitor visitor);
    Visitor getVisitor(Long id);
    List<Visitor>getAllVisitors();
}