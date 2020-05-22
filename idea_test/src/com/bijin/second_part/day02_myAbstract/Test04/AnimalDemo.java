package com.bijin.second_part.day02_myAbstract.Test04;
/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，按照多态的方式
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(4);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");

        a = new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");

        Animal d = new Dog();
        d.setName("拉布拉多");
        d.setAge(2);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        System.out.println("--------");

        d = new Dog("拉布拉多",2);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
    }
}
