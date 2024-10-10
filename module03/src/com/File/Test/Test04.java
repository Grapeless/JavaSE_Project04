package com.File.Test;

import java.io.File;

public class Test04 {
    public static void main(String[] args) {
        //Outline:File类常用方法--遍历文件夹
        //1.获取当前文件对象下所有的一级文件名到一个字符串数组中去
        File f1 = new File("D:\\Project");
        String[] fileName = f1.list();
        for (String s : fileName) {
            System.out.println(s);
        }

        //2.创建当前文件对象下所有的一级文件的文件对象到一个文件对象数组中去
        File f2 = new File("D:\\Project");
        File[] fileList = f1.listFiles();
        for (File file : fileList) {
            System.out.println(file.getAbsoluteFile());
        }

    }
}
