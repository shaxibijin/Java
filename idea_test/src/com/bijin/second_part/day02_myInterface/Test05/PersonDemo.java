package com.bijin.second_part.day02_myInterface.Test05;
/*
    测试类
 */
public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王浩");
        ppp.setAge(18);
        System.out.println(ppp.getName()+","+ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speakEnglish();
        System.out.println("----------");


        BasketballPlayer bbp = new BasketballPlayer();
        bbp.setName("刘正风");
        bbp.setAge(21);
        System.out.println(bbp.getName()+","+bbp.getAge());
        bbp.eat();
        bbp.study();
        System.out.println("----------");


        PingPangCoach ppc = new PingPangCoach();
        ppc.setName("刘宇翔");
        ppc.setAge(51);
        System.out.println(ppc.getName()+","+ppc.getAge());
        ppc.eat();
        ppc.teach();
        ppc.speakEnglish();
        System.out.println("----------");


        BasketballCoach bbc = new BasketballCoach();
        bbc.setName("刘翔");
        bbc.setAge(48);
        System.out.println(bbc.getName()+","+bbc.getAge());
        bbc.eat();
        bbc.teach();
        System.out.println("----------");

    }
}
