package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import jakarta.persistence.Column;


@Entity
public class Visitor{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true)
    private Long id;
    private String fullname;
    private String email;
    private String phone;
    private String idProof;
    private LocalDateTime createdAt;


public Long getId(){
    return id;
}
public void setId(Long id){
    this.id=id;
}
public String getFullname(){
    return fullname;
}
public void setFullname(String fullname){
    this.fullname=fullname;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}
public String getPhone(){
    return phone;
}
public void setPhone(String phone){
    this.phone=phone;
}
public String getIdProof(){
    return idProof;
}
public void setIdProof(String idProof){
    this.idProof=idProof;
}
public LocalDateTime getCreatedAt(){
    return createdAt;
}
public void setCreatedAt(LocalDateTime createdAt){
    this.createdAt=createdAt;
}


Visitor(Long id,String fullname,String email,String phone,String idProof,LocalDateTime createAt){
    this.id=id;
    this.fullname=fullname;
    this.email=email;
    this.phone=phone;
    this.idProof=idProof;
    this.createdAt=createdAt;
}
Visitor()
{}

}