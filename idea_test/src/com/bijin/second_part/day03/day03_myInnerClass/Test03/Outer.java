package com.bijin.second_part.day03.day03_myInnerClass.Test03;

public class Outer {
    public int num = 10;

    public void method() {

        int num2 = 20;

        class Inner {
            public void show() {
                System.out.println(num2);
                System.out.println(num);
            }
        }

        Inner i = new Inner();
        i.show();

    }
}
