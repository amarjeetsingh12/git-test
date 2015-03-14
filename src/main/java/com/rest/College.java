package com.rest;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: amarjeet.singh
 * Date: 28/09/14
 * Time: 1:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class College {
    private List<Student> students;

    public College() {
    }

    public College(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
