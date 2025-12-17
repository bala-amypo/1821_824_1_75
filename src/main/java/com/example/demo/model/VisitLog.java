package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Visitor{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private ManyToOne Visitor visitor;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private String purpose;
    private String location;


public Long getid()
{
    return id;
}
public void setid(Long id)
{
    this.id=id;
}
public ManyToOne getvisitor()
{
    return visitor;
}
public  void setFname(ManyToOne Visitor)
{
    this.visitor=visitor;
}
public  LocalDateTime getentryTime(){
    return entryTime;
}
public void setemail(LocalDateTime entryTime)
{
    this.entryTime=entryTime;
}
public LocalDateTime getexitTime()
{
    return exitTime;
}
public void setphone(LocalDateTime exitTime)
{
    this.exitTime=exitTime;
}
public String getpurpose()
{
    return idpurpose;
}
public void setidp(String purpose)
{
    this.idpurpose=idpurpose;
}
public String getlocation()
{
    return location;
}
public void setlocation(String location)
{
    this.location=location;
}
VisitLog()
{}
VisitLog(Long id,ManyToOne )
}