package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class ForEachTest {
    public static void main(String[] args) {
        //增强for循环
        //可以原来遍历数组和集合
        //for(容器元素的数据类型 变量名：数组或集合){}

        //数组
        int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
        }

        //集合
        Collection<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        for (int j : c) {
            System.out.println(j);
        }

        System.out.println("----------------");

        //for-Each
        c.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        //lambda简化
        //c.forEach( i -> System.out.println(i));
        //c.forEach(System.out::println);
    }
}
