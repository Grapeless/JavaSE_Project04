package com.Properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test01 {
    //Properties 是一个Map集合，用来处理属性文件，例如读写属性文件里的内容等
    public static void main(String[] args) {
        //1.new一个空Properties容器对象
        Properties p = new Properties();
        System.out.println(p);

        try {
            //2.load(Reader/InputStream ) 装载properties文件内容
            p.load(new FileReader("module04/src/com/Properties/users.properties"));
            System.out.println(p);

            //3.getProperties ~ Map.get()  读取
            String admin = p.getProperty("admin");
            String password = p.getProperty("password");
            System.out.println(admin + " " + password);

            //4.获取全部键的集合(String)
            Set<String> keys = p.stringPropertyNames();
            for (String key : keys) {
                System.out.println(key + "-->" + p.getProperty(key));
            }



            //lambda表达式
            //p.forEach((k, v) -> System.out.println(k + "-->" + v));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
