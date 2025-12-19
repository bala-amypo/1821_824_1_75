package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RiskScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long visitorId;

    private int score;

    private LocalDateTime evaluatedAt;

    public RiskScore() {
        this.evaluatedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public Long getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Long visitorId) {
        this.visitorId = visitorId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public LocalDateTime getEvaluatedAt() {
        return evaluatedAt;
    }
}
