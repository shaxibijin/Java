package com.bijin.second_part.day07.myMap.Test04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：
        创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储多个键值对元素，并遍历。
        要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象

    思路：
        1:定义学生类
        2:创建HashMap集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合
        6:在学生类中重写两个方法
            hashCode()
            equals()
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<Student,String> hm = new HashMap<Student,String>();
        //创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 35);
        Student s3 = new Student("王祖贤", 33);
        Student s4 = new Student("王祖贤", 33);

        //把学生添加到集合
        hm.put(s1,"广州");
        hm.put(s2,"深圳");
        hm.put(s3,"湛江");
        hm.put(s4,"韶关");


        //遍历集合
        //方式1：键值对对象找键和值
        Set<Map.Entry<Student, String>> entrySet = hm.entrySet();
        for (Map.Entry<Student, String> me:entrySet){
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }

        System.out.println("-------");

        //方式2：键找值
        Set<Student> keySet = hm.keySet();
        for (Student key : keySet){
            String value = hm.get(key);
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }
    }
}
