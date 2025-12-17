package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;


@Entity
public class Visitor{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
public String getfullname(){
    return fullname;
}
public void setfullname(String fullname){
    this.fullname=fullname;
}
public String getemail(){
    return email;
}
public void setemail(String email){
    this.email=email;
}
public String getphone(){
    return phone;
}
public void setphone(String phone){
    this.phone=phone;
}
public String getidProof(){
    return idProof;
}
public void setidp(String idProof){
    this.idProof=idProof;
}
public LocalDateTime getcreatedAt(){
    return createdAt;
}
public void setcreatedAt(LocalDateTime createdAt){
    this.createdAt=createdAt;
}
Visitor()
{}

Visitor(Long id,String fullname,String email,String phone,String idProof,LocalDateTime createAt){
    this.id=id;
    this.fullname=fullname;
    this.email=email;
    this.phone=phone;
    this.idProof=idProof;
    this.createdAt=createdAt;
};

}