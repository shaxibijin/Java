package com.bijin.second_part.day02_myInterface.Test03;

import java.util.Calendar;

public class Cat extends Animal implements Jumpping{
    public Cat(){

    }

    public Cat(String name,int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }

}
