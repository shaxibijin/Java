package com.bijin.day08_myString;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串数据：");
        String line = sc.nextLine();
        System.out.println("您输入的数据是："+ line );
    }
}
