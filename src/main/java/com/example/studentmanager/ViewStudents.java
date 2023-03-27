package com.example.studentmanager;

public class ViewStudents {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;
   /* public Student(String firstName, String lastName, int age, double meanGrade) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.meanGrade=meanGrade;
    }*/

    @Override
    public String toString() {
        return "Last name:"+lastName+" first name:"+firstName+" age:"+age+" meanGrade:"+meanGrade;
        //da
    }

    @Override
    public boolean equals(Object o) {
        //equals generated implementation
        return false;
    }

    @Override
    public int hashCode() {
     return 0;
    }
    }


