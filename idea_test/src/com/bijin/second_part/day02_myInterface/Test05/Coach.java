package com.bijin.second_part.day02_myInterface.Test05;
/*
    抽象教练类
 */
public abstract class Coach extends Person {
    public Coach(){
        }

    public Coach(String name ,int age){
        super(name,age);
    }

    public abstract void teach();


}
