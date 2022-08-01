package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student20it048 {
    @Id
    private Integer id;
    private String name;
    private String address;

    public Student20it048(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student20it048() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
