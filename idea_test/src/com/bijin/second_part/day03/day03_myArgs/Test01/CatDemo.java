package com.bijin.second_part.day03.day03_myArgs.Test01;

public class CatDemo {
    public static void main(String[] args) {
        //创建操作对象，并调用方法
        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.useCat(c);

        Cat c2 = new Cat();
        c2.eat();
    }
}
