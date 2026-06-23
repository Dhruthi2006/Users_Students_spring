package com.example.usersDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {



    private String name;
    @Id
    private int rollno;
    private String branch;
    private double cgpa;


    // JPA needs default constructor
    public Student() {

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }


    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }


    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}