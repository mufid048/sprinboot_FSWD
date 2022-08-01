package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {

    @Id
    private Integer id;

    private String semseter;

    private double percentage;

    public Result(Integer id, String semester, double percentage) {
        this.id = id;
        this.semseter = semester;
        this.percentage = percentage;
    }

    public Result() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSemester() {
        return semseter;
    }

    public void setSemester(String semester) {
        this.semseter = semseter;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}