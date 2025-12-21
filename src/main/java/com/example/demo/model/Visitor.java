package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "visitors")
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String phone;

    private String email; // optional

    @Column(nullable = false)
    private String idProof;

    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        if (phone == null || phone.trim().isEmpty()) {
            throw new RuntimeException("phone required");
        }
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters
}
