package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        //1.
        c.add("A");
        c.add("B");
        c.add("C");
        c.add("B");
        System.out.println(c); //重写过的toString
        //2.
        c.clear();
        System.out.println(c);
        c.add("A");
        c.add("B");
        c.add("C");
        c.add("B");
        //3.
        c.remove("B");
        System.out.println(c);
        //4.
        System.out.println(c.contains("B"));
        System.out.println(c.contains("D"));
        //5.
        System.out.println(c.isEmpty());
        c.clear();
        System.out.println(c.isEmpty());
        //6
        System.out.println(c.size());
        c.add("A");
        c.add("B");
        c.add("C");
        c.add("B");
        System.out.println(c.size());
        //7
        Object[] str = c.toArray();
        System.out.println(Arrays.toString(str));

        /*String[] str1 = c.toArray(new String[c.size]);
        System.out.println(Arrays.toString(str1));*/
        System.out.println("-------------------");

        //*8
        Collection<Integer> c1 =new ArrayList<>();
        c1.add(1);
        c1.add(2);
        Collection<Integer> c2 =new ArrayList<>();
        c2.add(3);
        c2.add(4);
        c1.addAll(c2);

    }
}
