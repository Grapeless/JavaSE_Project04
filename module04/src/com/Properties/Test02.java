package com.Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test02 {
    public static void main(String[] args) {
        Properties p = new Properties();
        //1.装载内容到p中
        p.setProperty("name","Lim");
        p.setProperty("age","18");
        p.setProperty("weight","100");

        try {
            //2.store(OutputStream/Writer ) 写入数据到properties文件中
            p.store(new FileWriter("module04/src/com/Properties/users2.properties"),
                    "一些用户信息");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
