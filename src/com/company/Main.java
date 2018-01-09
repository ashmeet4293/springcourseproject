package com.company;

import com.company.model.ProxyStudent;
import com.company.studentinterface.StudentData;

public class Main {

    public static void main(String[] args) {

        StudentData studentData=new ProxyStudent(10,"HARI BAHADUR",1000);
        studentData.getBookAccess();
    }
}
