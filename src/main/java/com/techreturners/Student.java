package com.techreturners;

public class Student {
    private static final String DEFAULT_NICKNAME = "MySecretNickName";
    private String name;
    private int group;
    private char grade;
    private String secretNickName;

    public Student(String name, int group, char grade) {
        if(grade < 'A' || grade > 'F'){
            throw new IllegalArgumentException("Invalid Grade " + grade);
        }
        if(group < 1 || group > 5){
            throw new IllegalArgumentException("Invalid Group " + group);
        }

        this.name = name;
        this.group = group;
        this.grade = grade;
        this.secretNickName = DEFAULT_NICKNAME;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public char getGrade() {
        return grade;
    }


    public char downGrade (){
        if (this.grade < 'F') {
            int nextValue = (int) this.grade + 1;
            this.grade = (char) nextValue;
        }
        return this.grade;
    }

    public char upGrade (){
        if(this.grade > 'A') {
            int nextValue = (int) this.grade - 1;
            this.grade = (char) nextValue;
        }
        return this.grade;
    }

}
