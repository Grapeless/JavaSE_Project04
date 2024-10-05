package com.collections;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //1.
        List<Integer> al =new ArrayList<>();
        Collections.addAll(al,1,2,3,4);
        System.out.println(al); //调用ArrayList的toString方法时嵌套调用其元素类型自身的toString方法

        //2.打乱List集合中元素的顺序
        Collections.shuffle(al);
        System.out.println(al);

        //3.对List集合中的元素进行升序排序
        //集合内元素为自定义类型时需要自己定义比较规则(1.自定义类型实现Comparable接口 2.定义比较器对象）
        Collections.sort(al);
        System.out.println(al);

        List<Student> list = new ArrayList<>();
        list.add(new Student(12,120.0));
        list.add(new Student(20,130.0));
        list.add(new Student(18,100.0));

        //Collections.sort(list);
        /*Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getWeight(),o2.getWeight());
            }
        });*/
        Collections.sort(list,(o1, o2) -> Double.compare(o1.getWeight(), o2.getWeight()));
        System.out.println(list);
    }
}
