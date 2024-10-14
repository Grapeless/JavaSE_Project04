package com.Collection.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    //基于红黑树的排序,只能对键排序
    //1.对于Integer，Double按照其值大小升序排序
    //2.对于String类，按首字符编号进行排序
    //3.对于自定义类型：
      //自定义排序规则：comparable
      //自定义比较器：comparator
      //排序规则
      //左大于右 返回正整数
      //左小于右 返回负整数
      //左等于右 返回0,且TreeSet只会保留一个相同对象
    public static void main(String[] args) {
        /*Set<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });*/
        //lambda简化
        Set<Student> set = new TreeSet<>((o1,o2) -> Double.compare(o1.getHeight(),o2.getHeight()));

        set.add(new Student(12,180.3));
        set.add(new Student(18,178.3));
        set.add(new Student(15,169.3));
        //就近原则，自己的比较器对象被定义，则使用自己的，而不是Student中的compareTo
        System.out.println(set);
    }
}
