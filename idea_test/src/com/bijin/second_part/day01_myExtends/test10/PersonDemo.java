package com.bijin.second_part.day01_myExtends.test10;

public class PersonDemo {
    public static void main(String[] args) {
        //创建老师对象并进行测试
        Teacher t1 = new Teacher();
        t1.setName("林青霞");
        t1.setAge(30);
        System.out.println(t1.getName() + ","+ t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("刘正风",23);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();


        //创建学生对象并进行测试
        Student s1 = new Student();
        s1.setName("风清扬");
        s1.setAge(18);
        System.out.println(s1.getName()+","+s1.getAge());
        s1.study();

        Student s2 = new Student("张爱静",19);
        System.out.println(s2.getName()+","+s2.getAge());
        s2.study();


    }
}
