package com.bijin.second_part.day02_myInterface.Test03;
/*
    测试类
 */
public class AnimaDemo {
    public static void main(String[] args) {
        //创建猫对象，调用方法
        Jumpping j = new Cat();
        j.jump();
        System.out.println("--------");

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(3);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("--------");

        a = new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
      //  a.jump();
        System.out.println("--------");


        Cat c = new Cat();
        c.setName("大傻灰");
        c.setAge(2);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();
        System.out.println("--------");

        //创建狗对象，调用方法
        Jumpping dd = new Dog();
        dd.jump();
        System.out.println("---------");

        Animal d = new Dog();
        d.setName("Lala");
        d.setAge(3);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        System.out.println("---------");


        d = new Dog("Lala",2);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        System.out.println("---------");


        Dog dog = new Dog();
        dog.setName("金毛");
        dog.setAge(5);
        System.out.println(dog.getName()+","+dog.getAge());
        dog.eat();
        dog.jump();



    }
}