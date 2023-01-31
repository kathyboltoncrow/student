package com.techreturners;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Peter", 4,'A');
        System.out.println(student.getName());
        System.out.println(student.getGrade());
        System.out.println(student.downGrade());
        System.out.println(student.upGrade());
    }

}