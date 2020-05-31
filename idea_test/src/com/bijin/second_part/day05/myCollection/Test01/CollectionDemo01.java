package com.bijin.second_part.day05.myCollection.Test01;

import java.util.ArrayList;
import java.util.Collection;

/*
    创建Collection集合的对象
        多态的方式
        ArrayList()
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();

        //添加元素：boolean add​(E e)

        c.add("Hello");
        c.add("World");
        c.add("Java");
        //输出集合对象

        System.out.println(c);
    }
}
