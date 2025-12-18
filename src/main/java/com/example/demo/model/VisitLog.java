package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;


@Entity
public class VisitLog{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private String purpose;
    private String location;


public Long getId(){
    return id;
}
public void setId(Long id){
    this.id=id;
}
public  LocalDateTime getEntryTime(){
    return entryTime;
}
public void setEntryTime(LocalDateTime entryTime){
    this.entryTime=entryTime;
}
public LocalDateTime getExitTime(){
    return exitTime;
}
public void setExitTime(LocalDateTime exitTime){
    this.exitTime=exitTime;
}
public String getPurpose(){
    return purpose;
}
public void setPurpose(String purpose){
    this.purpose=purpose;
}
public String getLocation(){
    return location;
}
public void setLocation(String location){
    this.location=location;
}

public VisitLog(Long id,LocalDateTime entryTime,LocalDateTime exitTime,String purpose,String location){
    this.id=id;
    this.entryTime=entryTime;
    this.exitTime=exitTime;
    this.purpose=purpose;
    this.location=location;
}
public VisitLog()
{}
}