package com.bijin.second_part.day04.myException.Test04;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");

        int score = sc.nextInt();

        try {
            t.checkScore(score);
        }catch (ScoreException e){
            e.printStackTrace();
        }
    }
}
