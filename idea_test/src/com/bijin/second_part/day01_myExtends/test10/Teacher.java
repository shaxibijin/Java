package com.bijin.second_part.day01_myExtends.test10;

public class Teacher extends Person {

    public Teacher(){

    }

    public Teacher(String name,int age){
        super(name,age);
    }

    public void teach(){
        System.out.println("用爱成就每一位学生");
    }
}
