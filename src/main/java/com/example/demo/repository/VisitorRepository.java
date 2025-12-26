package com.example.demo.repository;

import com.example.demo.model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
    // Additional custom methods can be added here if needed
}
