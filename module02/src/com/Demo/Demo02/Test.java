package com.Demo.Demo02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        String userStr = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:刘备:男:1899-01-01" +
                "#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01" +
                "#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";
        List<User> userList = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String[] splitUserStr = userStr.split("#");  //分成单个对象需要的字符串
        String[] splitAttr;
        for (String s : splitUserStr) {
            splitAttr = s.split(":");   //分成一个对象各个属性
            userList.add(new User(Long.parseLong(splitAttr[0]), splitAttr[2],
                    splitAttr[1], LocalDate.parse(splitAttr[3], dtf)));
        }
        System.out.println(userList);


        Map<String,Integer> userNameMap = new HashMap<>();
        for (User user : userList) {
            if(userNameMap.containsKey(user.getName())){
                userNameMap.put(user.getName(),userNameMap.get(user.getName())+1);
            }else {
                userNameMap.put(user.getName(),1);
            }
        }
        userNameMap.forEach((k,v)-> System.out.println(k+":"+v+"次"));

    }
}
