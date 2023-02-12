package com.example.hibernate.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Product implements Serializable {

    //primary key
    @Id
    //tu dong generate tu tang
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;


    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
