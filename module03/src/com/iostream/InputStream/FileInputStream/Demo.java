package com.iostream.InputStream.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Demo {
    //读取文件到内存，使用文件字节输入流一次读完全部字节来避免中文乱码
    public static void main(String[] args) throws Exception {
        InputStream is1 = new FileInputStream("module03/IOStreamTest/C.txt");

        //1.准备一个buffer字节数组，大小与文件的大小一致
        long fileSize = (new File("module03/IOStreamTest/C.txt")).length();
        byte[] buffer1 = new byte[(int) fileSize];  //byte数组最多接受一个int大小的文件

        System.out.println(is1.read(buffer1));
        System.out.println(new String(buffer1));

        is1.close();
        System.out.println();

        //2.使用readAllBytes
        //byte[] buffer2 = is1.readAllBytes(); //流只能顺序读取一次,应新建一个流读取
        InputStream is2 = new FileInputStream("module03/IOStreamTest/C.txt");
        byte[] buffer2 = is2.readAllBytes();  //返回一个包含文件全部字节的数组 ,会校验文件是否过大
        System.out.println(new String(buffer2));

        is2.close();
    }
}
