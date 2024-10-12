package com.File.Demo.Demo02;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        delFile(new File("module03/IOStreamTest"));
    }

    public static void delFile(File f) {
        if (f == null || !f.exists()) {   //空指针，url不存在
            return;
        }

        File[] files = f.listFiles();
        //不可访问
        if (files != null) {
            //空文件,是合法的情况
            for (File file : files) {
                //如果是文件，则是否为空都可删
                if (file.isFile()) {
                    System.out.println(file.getName() + " " + file.length() + " " + file.delete());
                } else if (file.list().length == 0) {
                    System.out.println(file.getName() + " " + file.length() + " " + file.delete());
                } else {
                    delFile(file);
                }
            }
            if (f.list().length == 0) {
                System.out.println(f.getName() + " " + f.length() + " " + f.delete());
            }
        }
    }
}

