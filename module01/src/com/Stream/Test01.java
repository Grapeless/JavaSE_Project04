package com.Stream;

import java.util.*;
import java.util.stream.Stream;

//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/stream/package-summary.html
public class Test01 {
    //获取Stream流
    public static void main(String[] args) {
        //1.获取单值集合的Stream流。对于Collection，及以下的List，Set,直接调用stream()方法，返回一个stream对象
        List<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();

        Set<Integer> set = new HashSet<>();
        Stream<Integer> s2 = set.stream();

        //2.获取Map集合的stream流。
        Map<String,Integer> map = new HashMap<>();
        //2.1将键和值分别转为单值集合
        Set<String> set1 =  map.keySet();
        Collection<Integer> collection = map.values();
        Stream<String> s3 = set1.stream();
        Stream<Integer> s4 = collection.stream();
        //2.2封装为Map.Entry<T,V>对象
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Stream<Map.Entry<String, Integer>> s5 = entries.stream();
        //Stream<Map.Entry<String, Integer>> s5 = map.entrySet().stream();

        //3.获取数组的stream流
        String[] str = new String[]{"1"};
        //3.1 Arrays类下的stream方法
        Stream<String> s6 = Arrays.stream(str);
        //3.2 Stream类下的of方法
        Stream<String> s7 = Stream.of(str);


    }


}
