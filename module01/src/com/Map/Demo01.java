package com.Map;

import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(4);
        String[] str = {"A","B","C","D"};
        List<String> destList = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            destList.add(str[r]);
            r = random.nextInt(4);
        }
        Map<String,Integer> map = new HashMap<>();
        for (String s : destList) {
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
        System.out.println(destList);
        map.forEach((k,v)-> System.out.println(k+"-->"+v));
    }
}
