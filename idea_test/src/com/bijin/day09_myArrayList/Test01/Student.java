package com.bijin.day09_myArrayList.Test01;
/*
    学生类
 */
public class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
