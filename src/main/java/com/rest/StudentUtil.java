package com.rest;

import java.util.List;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: amarjeet.singh
 * Date: 21/07/14
 * Time: 11:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class StudentUtil {
    private static List<Student> studentList=new Vector<Student>();
    static {
        studentList.add(new Student("Amarjeet","31"));
        studentList.add(new Student("Tamanna","24"));
        studentList.add(new Student("Ravi","37"));
        studentList.add(new Student("Meetali","25"));
    }

    public static List<Student> getStudents(){
        return studentList;
    }

    public static Student getStudent(String rollNo){
        for(Student student:studentList){
            if(student.rollNo.equalsIgnoreCase(rollNo)){
                return student;
            }
        }
        return null;
    }
    public static void addStudent(Student student){
        studentList.add(student);
    }
}
