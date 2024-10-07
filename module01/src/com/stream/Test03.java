package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test03 {
    //Stream流常见终结方法(不再返回Stream对象的方法)
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 2, 7, 4, 9, 5, 2, 1);
        List<Student> studentList =new ArrayList<>();
        studentList.add(new Student("Lim",18,185.0));
        studentList.add(new Student("ALex",20,168.0));
        studentList.add(new Student("Alexander",16,176.0));
        studentList.add(new Student("Zoe",23,173.0));
        studentList.add(new Student("Zoe",23,173.0));

        //0.forEach

        //1.count 流中有多少对象
        long n = studentList.stream().filter(student -> student.getAge() >= 18).count(); //大于18岁的对象有多少个
        System.out.println(n);

        //2,3.max,min 找到唯一的最_对象(数据)返回该对象(数据)到一个Optional容器后终结
        Integer i1 = list.stream().max((l1, l2) -> l1 - l2).get();  //最大
        System.out.println(i1);

        Integer i2 = list.stream().max((l1, l2) -> l2 - l1).get();  //最大
        System.out.println(i2);

        //4.收集Stream流到
        //4.1集合中去
        //4.2数组中去
    }
}
