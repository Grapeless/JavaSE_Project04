package com.File.Test;

import java.io.File;

public class Test03 {
    public static void main(String[] args) throws Exception{
        //Outline:File类常用方法--创建文件，删除文件

        //1.创建一个新文件,创建成功返回true
        File f1 = new File("module03/IOStreamTest/B.txt"); //该文件不存在
        System.out.println(f1.createNewFile());

        //2.创建一级文件夹（该方法只能创建一级文件夹）
        //File f2 = new File("module03/IOStreamTest/1/2/3");  多级文件夹创建失败
        File f2 = new File("module03/IOStreamTest/1");
        System.out.println(f2.mkdir());

        //3.创建多级文件夹
        File f3 = new File("module03/IOStreamTest/1/2/3");
        System.out.println(f3.mkdirs());

        //4.删除文件及空的文件夹，无法删除非空文件夹
        File f4 = new File("module03/IOStreamTest/1/2");
        System.out.println(f4.delete());  //false 2为非空文件夹
        File f5 = new File("module03/IOStreamTest/1/2/3");
        System.out.println(f5.delete());  //true

        File f6 = new File("module03/IOStreamTest/B.txt");
        System.out.println(f6.delete());  //true
    }
}
