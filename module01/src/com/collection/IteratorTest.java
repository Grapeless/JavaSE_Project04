package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("A");
        c.add("B");
        c.add("C");

        //1.从集合器对象中获取迭代器对象
        Iterator<String> iterator = c.iterator();

        //2.next()方法，便利一次移动一次
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        //System.out.println(iterator.next());

        //使用循环结合迭代器遍历集合
        //3.hasNext()方法
        Collection<Integer> c2 =new ArrayList<>();
        c2.add(1);
        c2.add(2);
        c2.add(3);
        c2.add(4);
        Iterator<Integer> iterator2 =c2.iterator();
        do {
            System.out.println(iterator2.next());
        } while (iterator2.hasNext());

    }
}
