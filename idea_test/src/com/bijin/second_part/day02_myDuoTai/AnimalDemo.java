package com.bijin.second_part.day02_myDuoTai;

/**
 * 测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫对象进行测试
        Animal a = new Cat();
        a.setName("梨花");
        a.setAge(3);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();


        //创建狗对象进行测试
        Animal b = new Dog();
        b.setName("拉布拉多");
        b.setAge(4);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();
    }
}
