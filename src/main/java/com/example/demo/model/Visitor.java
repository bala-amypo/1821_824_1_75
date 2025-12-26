package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "visitors")
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String phone;
    private String email;
    private String idProof;

    @OneToMany(mappedBy = "visitor", cascade = CascadeType.ALL)
    private List<VisitLog> visitLogs;

    @OneToOne(mappedBy = "visitor", cascade = CascadeType.ALL)
    private RiskScore riskScore;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getIdProof() { return idProof; }
    public void setIdProof(String idProof) { this.idProof = idProof; }

    public List<VisitLog> getVisitLogs() { return visitLogs; }
    public void setVisitLogs(List<VisitLog> visitLogs) { this.visitLogs = visitLogs; }

    public RiskScore getRiskScore() { return riskScore; }
    public void setRiskScore(RiskScore riskScore) { this.riskScore = riskScore; }
}
