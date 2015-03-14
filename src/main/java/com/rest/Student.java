package com.rest;

import java.util.List;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: amarjeet.singh
 * Date: 21/07/14
 * Time: 10:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Student {
    String name;
    String rollNo;

    public Student() {
    }

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

}
