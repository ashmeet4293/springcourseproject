package com.company.model;

import com.company.studentinterface.StudentData;

public class RealStudent implements StudentData{
    int id;
    String name;
    double fee;

    public RealStudent() {
    }

    public RealStudent(int id, String name, double fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public void getBookAccess() {
        System.out.println("Can get Access ");
    }
}
