package com.bijin.second_part.day01_myExtends.test11_catAnddog;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookdoor(){
        System.out.println("狗看门");
    }
}
