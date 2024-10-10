package com.File.Test;

import java.io.File;
import java.text.SimpleDateFormat;

public class Test02 {
    public static void main(String[] args) {
        //Outline:File类常用方法--判断文件类型，获取文件信息
        File f1 = new File("module03/IOStreamTest/A.txt");

        //1.exists
        System.out.println(f1.exists());

        //2.是否为文件
        System.out.println(f1.isFile());

        //3.是否为文件夹
        System.out.println(f1.isDirectory());

        //4.获取文件名，包含后缀名
        System.out.println(f1.getName());

        //5.length 返回文件大小（字节数）

        //6.获取最后修改时间,返回一个时间毫秒
        long l = f1.lastModified();
        System.out.println(new SimpleDateFormat("yyyy.MM.dd HH.mm.ss").format(l));

        //7.获取创建文件对象时使用的路径
        File f2 = new File("module03/IOStreamTest/A.txt");
        File f3 = new File("D:/Project/IDEA/JavaSE/Project04/module03/IOStreamTest/A.txt");
        System.out.println(f2.getPath());
        System.out.println(f3.getPath());

        //8.获取绝对路径
        System.out.println(f1.getAbsolutePath());
    }
}
