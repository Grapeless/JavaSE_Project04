package com.File.Test;

import java.io.File;

public class Test01 {
    public static void main(String[] args) {
        //Outline:创建一个File对象，指代某个具体的文件（文件夹）(甚至是不存在的文件)

        //可以用两个反斜杠来避免与转义字符(也是以反斜杠开始）出现混乱
        File f1 = new File("D:\\Project\\IOStream\\Book.txt");
        //或者用单正斜杠即可
        File f2 = new File("D:/Project/IOStream/Book.txt");
        //又或者用 File.separator替代正斜杠
        File f3 = new File("D:"+File.separator+"Project"+File.separator+"IOStream"+File.separator+"Book.txt");

        System.out.println(f1.length());
        System.out.println(f1.length() == f2.length());
        System.out.println(f2.length() == f3.length());

        File f4 = new File("D:/Project/IOStream"); //指代一个文件夹，该对象只包含该文件夹本身的信息，而不包含该文件夹下文件的信息
        System.out.println(f4.exists());
        System.out.println(f4.length());

        File f5 = new File("D:/Project/IOStream/book1.txt"); //指代一个不存在的文件
        //File f5 = new File("D:/Project/IOStream/book.txt"); //f5.exists() == true ,不区分大小写？
        System.out.println(f5.exists());
        System.out.println(f5.length());

        //绝对路径：带盘符的
        //相对路径:不带盘符，默认在工程下寻找文件
        File f6 = new File("module03/IOStreamTest/A.txt");
        System.out.println(f6.exists());
        System.out.println(f6.length());
        //System.out.println(System.getProperty("user.dir"));

    }

}
