package com.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Test02 {
    //Stream流常见中间方法
    //如排序，过滤，去重等
    //支持链式编程
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 2, 7, 4, 9, 5, 2, 1);
        List<Student> studentList =new ArrayList<>();
        studentList.add(new Student("Lim",18,185.0));
        studentList.add(new Student("ALex",20,168.0));
        studentList.add(new Student("Alexander",16,176.0));
        studentList.add(new Student("Zoe",23,173.0));
        studentList.add(new Student("Zoe",23,173.0));

        //1.filter
       /* Stream<Integer> s = list.stream();
        s.filter(i -> i > 3).forEach(System.out::println);*/
        //每个流对象只读取一次，可以采用下面的用法
        list.stream().filter(i -> i > 3).forEach(System.out::print);
        System.out.println();

        //2.sorted
        list.stream().filter(i -> i < 3).sorted().forEach(System.out::print); //默认升序
        System.out.println();
        list.stream().filter(i -> i < 3).sorted((i1, i2) -> i2 - i1).forEach(System.out::print); //自定义比较器
        System.out.println();
        studentList.stream().filter(student -> student.getAge()>=18)
                .sorted((s1,s2)->s1.getAge()-s2.getAge()).forEach(System.out::print);  //排序自定义类型
        System.out.println();

        //3.limit 取前几个数据
        studentList.stream().sorted((s1,s2)->Double.compare(s2.getHeight(), s1.getHeight()))
                .limit(3).forEach(System.out::print);    //降序排序取前三
        System.out.println();

        //4.skip 跳过几个数据后再取数据
        studentList.stream().sorted((s1,s2)->Double.compare(s1.getHeight(), s2.getHeight()))
                .skip(studentList.size()-2).forEach(System.out::print);   //升序排序取倒二
        System.out.println();

        //5.distinct 去重（比较哈希值）。故要去除内容相同的自定义对象，要重写其equals和hashCode方法。
        //6.map 映射方法，从流对象中映射出单个属性
        studentList.stream().map(Student::getName).forEach(System.out::print);  //映射出name
        System.out.println();
        studentList.stream().map(Student::getName).distinct().forEach(System.out::print); //去除相同的字符串
        System.out.println();

        //studentList.stream().distinct().forEach(System.out::print);  //未重写equals和hashCode方法前，该输出仍然含有相同对象
        studentList.stream().distinct().forEach(System.out::print);
        System.out.println();

        //7.concat 合并流  (static方法)
        Stream<Integer> s1 = Stream.of(1,2,3);
        Stream<Integer> s2 = Stream.of(4,5,6);
        Stream<Integer> S = Stream.concat(s1, s2);
        S.forEach(System.out::print);
        System.out.println();


    }
}