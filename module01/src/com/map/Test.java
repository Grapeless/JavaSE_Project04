package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test {
    //键值对集合，一次存入一对数据。
    //键唯一，不允许重复，但值可以重复。
    //Map集合特点由键决定

    //HashMap: 无序，不重复，无索引
    //HashLinkedMap:有序，不重复，无索引
    //TreeMap:按键大小默认升序排序，不重复，无索引
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); //Classic

        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Map.html
        //1.put
        map.put("垃圾", 100);
        map.put("鞋", 1);
        map.put("垃圾", 200);  //同键后放入的覆盖前面的
        map.put("人", 10);
        System.out.println(map); //重写过的toString方法

        //2.size
        System.out.println(map.size());

        //3.clear

        //4.isEmpty
        System.out.println(map.isEmpty());

        //5.get 根据键获取对应值
        int n1 = map.get("人");
        System.out.println(n1);

        //6.remove 根据键删除对应值并返回该值
        int n2 = map.remove("垃圾");
        System.out.println(n2);
        System.out.println(map);

        //7.containsKey
        System.out.println(map.containsKey("人"));

        //8.containsValue
        System.out.println(map.containsValue(1));

        //9.keySet 返回所有键组成的一个Set集合
        Set<String> set = map.keySet();
        System.out.println(set);

        //10.values 返回所有值组成的Collection集合
        Collection<Integer> c = map.values();
        System.out.println(c);

        //*11 putAll
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map2.put("C", 3);
        map2.put("D", 4);
        map1.putAll(map2);
        System.out.println(map2);
        System.out.println(map1);

        //遍历1.键找值：先获取全部键，在通过遍历键来找值
        Set<String> set1 = map1.keySet();
        for (String s : set1) {
            System.out.println(s + "==>" + map1.get(s));
        }
        System.out.println("=========");
        //遍历2.键值对
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();   //entrySet()，封装为Entry对象
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());       //.getKey() .getValue()
        }
        System.out.println("=========");
        //遍历3.forEach
        map1.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + "-->" + integer);
            }
        });
        System.out.println("---------");
        //lambda简化
        map1.forEach((k, v) -> System.out.println(k + "-->" + v));



    }
}
