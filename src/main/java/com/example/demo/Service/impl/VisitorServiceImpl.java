package com.example.demo.service.impl;

import com.example.demo.entity.Visitor;
import com.example.demo.service.VisitorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorServiceImpl implements VisitorService {

    @Override
    public List<Visitor> getAll() {
        return List.of();
    }

    @Override
    public Visitor getById(Long id) {
        return null;
    }
}
