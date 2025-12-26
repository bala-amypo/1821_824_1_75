package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String phone;
    private String idProof;
    private String email;

    @OneToMany(mappedBy = "visitor", cascade = CascadeType.ALL)
    private List<VisitLog> visitLogs;

    @OneToOne(mappedBy = "visitor", cascade = CascadeType.ALL)
    private RiskScore riskScore;

    public Visitor() {}

    public Visitor(Long id, String fullName, String phone, String idProof, String email) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.idProof = idProof;
        this.email = email;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getIdProof() { return idProof; }
    public void setIdProof(String idProof) { this.idProof = idProof; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<VisitLog> getVisitLogs() { return visitLogs; }
    public void setVisitLogs(List<VisitLog> visitLogs) { this.visitLogs = visitLogs; }

    public RiskScore getRiskScore() { return riskScore; }
    public void setRiskScore(RiskScore riskScore) { this.riskScore = riskScore; }
}
