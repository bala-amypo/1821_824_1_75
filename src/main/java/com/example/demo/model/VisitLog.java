package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class VisitLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "visitor_id", nullable = false)
    private Visitor visitor;

    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    @Column(nullable = false)
    private String purpose;

    @Column(nullable = false)
    private String location;

    @PrePersist
    public void prePersist() {
        this.entryTime = LocalDateTime.now();
        if (exitTime != null && exitTime.isBefore(entryTime)) {
            throw new IllegalArgumentException("exitTime must be after entryTime");
        }
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Visitor getVisitor() { return visitor; }
    public void setVisitor(Visitor visitor) { this.visitor = visitor; }

    public LocalDateTime getEntryTime() { return entryTime; }
    public void setEntryTime(LocalDateTime entryTime) { this.entryTime = entryTime; }

    public LocalDateTime getExitTime() { return exitTime; }
    public void setExitTime(LocalDateTime exitTime) { this.exitTime = exitTime; }

    public String getPurpose() { return purpose; }
    public void setPurpose(String purpose) { this.purpose = purpose; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}
