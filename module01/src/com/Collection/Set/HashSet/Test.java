package com.Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

//基于哈希表的存储方式，且是链式表示
//支链过长时，使用红黑树平衡
public class Test {
    public static void main(String[] args) {
        //去重复：如果希望Set认为两个内容相同的对象是重复的，则需重写其hashCode(),equals()方法

        Student1 s1 = new Student1(12,"lim");
        Student1 s2 = new Student1(12,"lim");
        Set<Student1> set1 = new HashSet<>();  //Classic
        set1.add(s1);
        set1.add(s2);
        System.out.println(s1.hashCode()+" "+s2.hashCode());
        System.out.println(set1);  //s1与s2内容相同，但set内仍然有两个元素

        //重写了Student2的hashCode(),equals()方法
        Student2 s3 =new Student2(18,"alex");
        Student2 s4 =new Student2(18,"alex");
        Set<Student2> set2 =new HashSet<>();
        set2.add(s3);
        set2.add(s4);
        System.out.println(s3.hashCode()+" "+s4.hashCode());
        System.out.println(set2);
    }
}
