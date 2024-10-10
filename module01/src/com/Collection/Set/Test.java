package com.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set系列集合：元素无序，不重复，无索引
//HashSet:元素无序，不重复，无索引
  //LinkedHashSet:元素有序，不重复，无索引
//TreeSet:按大小默认升序排序，不重复，无索引
public class Test {
    public static void main(String[] args) {
        Set<Integer> set1 =new HashSet<>();
        Set<Integer> set2 =new LinkedHashSet<>();
        Set<Integer> set3 =new TreeSet<>();
        set1.add(666);
        set1.add(555);
        set1.add(555);
        set1.add(888);
        set1.add(777);
        set1.add(777);

        set2.add(666);
        set2.add(555);
        set2.add(555);
        set2.add(888);
        set2.add(777);
        set2.add(777);

        set3.add(666);
        set3.add(555);
        set3.add(555);
        set3.add(888);
        set3.add(777);
        set3.add(777);
        System.out.println(set1);//HashSet:元素无序，不重复，无索引
        System.out.println(set2);//LinkedHashSet:元素有序，不重复，无索引
        System.out.println(set3);//TreeSet:按大小默认升序排序，不重复，无索引
    }
}
