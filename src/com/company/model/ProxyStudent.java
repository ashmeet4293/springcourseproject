package com.company.model;

import com.company.studentinterface.StudentData;

public class ProxyStudent implements StudentData {

    int id;
    String name;
    double fee;

    //This is somehting

    public ProxyStudent(){
    }

    public ProxyStudent(int id, String name, double fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    @Override
    public void getBookAccess() {
        RealStudent realStudent=new RealStudent(id,name,fee);
        if(realStudent.getFee() >1000){
            realStudent.getBookAccess();
        }else{
            System.out.println("Cannot get book access ");
        }

    }
}
