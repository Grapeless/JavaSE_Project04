package com.collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

//List系列集合：元素有序，可重复，有索引
public class ListTest {
    public static void main(String[] args) {
        //fun1();
        fun2();
    }

    //常用方法
    public static void fun1() {
        //多态写法，ArrayList用的多
        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);
        System.out.println(list);
        //1.
        list.add(1, 1.5);
        System.out.println(list);
        //2.
        System.out.println(list.remove(1));
        System.out.println(list);
        //3.
        System.out.println(list.get(1));
        //4.
        System.out.println(list.set(1, 1.5));
        System.out.println(list);
    }

    //遍历方式
    public static void fun2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //增强for循环
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        //迭代器
        Iterator<Integer> iterator = list.iterator();
        do {

            System.out.print(iterator.next() + " ");
        } while (iterator.hasNext());
        System.out.println();
        //forEach与lambda表达式
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + " ");
            }
        });
        System.out.println();
        list.forEach(i -> System.out.print(i + " "));
    }
}
