package com.example.demo.service.imple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Visitor;
import com.example.demo.repository.VisitorRepository;
import com.example.demo.service.VisitorService;

@Service
public class VisitorServiceImple implements VisitorService {

    private final VisitorRepository visitorRepository;

    public VisitorServiceImple(VisitorRepository visitorRepository) {
        this.visitorRepository = visitorRepository;
    }

    @Override
    public Visitor createVisitor(Visitor visitor) {
        return visitorRepository.save(visitor);
    }

    @Override
    public Visitor getVisitor(Long id) {
        return visitorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Visitor> getAllVisitors() {
        return visitorRepository.findAll();
    }
}