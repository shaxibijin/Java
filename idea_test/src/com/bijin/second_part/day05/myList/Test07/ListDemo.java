package com.bijin.second_part.day05.myList.Test07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/*
    List集合常用子类：ArrayList，LinkedList
        ArrayList：底层数据结构是数组，查询快，增删慢
        LinkedList：底层数据结构是链表，查询慢，增删快

    练习：
        分别使用ArrayList和LinkedList完成存储字符串并遍历
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array =  new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历
        for (String s : array){
            System.out.println(s);
        }
        System.out.println("--------");

        //迭代器
        Iterator<String> it = array.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");

        //for循环
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
        System.out.println("--------");


        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        //迭代器
        Iterator<String> itt = linkedList.iterator();
        while (itt.hasNext()){
            String ss = itt.next();
            System.out.println(ss);
        }
        System.out.println("--------");

        //增强for
        for (String ss : linkedList){
            System.out.println(ss);
        }
        System.out.println("--------");

        //for
        for (int i = 0; i < linkedList.size(); i++) {
            String ss = linkedList.get(i);
            System.out.println(ss);
        }

    }
}
