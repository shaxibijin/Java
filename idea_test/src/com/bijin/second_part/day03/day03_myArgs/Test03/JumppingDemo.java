package com.bijin.second_part.day03.day03_myArgs.Test03;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.userJumpping(j);

        Jumpping j2 = jo.getJumpping();//new Cat()
        j2.Jump();

    }
}
