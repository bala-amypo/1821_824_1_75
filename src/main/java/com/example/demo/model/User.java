package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @column(unique=true)
    private String email;
    

    public Long getid{
        return id;
    }
    public void setid{
        this.id=id;
    }
    public String getemail{
        this.email=email;
    }

}