package com.Demo.Demo01;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(); //多轮增删元素，用LinkedList
        //1.生成100个编号（1~200），不重复
        //2.删除元素
        //3.输出目标元素

        Random random = new Random();
        int r = random.nextInt(201);

        while (list.size()!=100) {
            if (!list.contains(r)) {
                list.add(r);
            }
            r = random.nextInt(201);
        }


        List<Integer> list1 = new LinkedList<>(list);


        while (list.size()!=1) {
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {

                    iterator.next();
                    iterator.remove();
                    if (iterator.hasNext()) {  // 检查是否还有下一个元素
                    iterator.next();  // 跳过下一个元素
                }

            }
        }


        //2,4,5,6,7,8
        System.out.println(list1);
        System.out.println(list);
        System.out.println("编号"+list.get(0));
        System.out.println("初始位置"+list1.indexOf(list.get(0)));

    }

}
