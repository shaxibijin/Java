package com.bijin.second_part.day02_myInterface.Test05;

public class BasketballCoach extends Coach {

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }
}
