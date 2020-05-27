package com.bijin.second_part.day04.mySimpleDateFormat.Test02;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);

        String s3 = DateUtils.dateToString(d, "HH:mm:ss");
        System.out.println(s3);
        System.out.println("--------");

        String s4 = "2020-05-09 12:12:12";
        Date dd =DateUtils.stringToDate(s4, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }
}
