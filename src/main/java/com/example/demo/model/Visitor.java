package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Loca

@Entity
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idProof;
    private String fullName;
    private String email;
    private LocalDateTime crreatedAt;
    public Visitor() {}

    public Visitor(Long id,String fullName, String email,String phone,String idProof,LocalDateTime createdAt) {
        this.id=id;
        this.fullName = fullName;
        this.email = email;
        this.phone=phone;
        this.idProof=idProof;
        this.createdAt=createdAt;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullName) {
        this.fullame = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setcreatedAt(LocalDateTime creadtedAt){
        this.createdAt=createdAt;
    }
}
