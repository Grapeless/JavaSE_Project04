package com.iostream.ByteStream.InputStream.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test {
    //文件字节输入流
    public static void main(String[] args) throws Exception {
        //1.创建流管道
        FileInputStream fis1 = new FileInputStream(new File("module03/IOStreamTest/A.txt"));
        //直接使用文件路径,推荐写法
        FileInputStream fis2 = new FileInputStream("module03/IOStreamTest/A.txt");
        //多态写法
        InputStream is1 = new FileInputStream("module03/IOStreamTest/A.txt");

        //2.read(),读取一个字节，返回该字节的值（一个介于 0 到 255 之间的整数）,读空返回-1。
        int b1 = is1.read();
        System.out.println((char) b1);
        //流式读取，不会从头开始
        int b2 = is1.read();
        System.out.println((char) b2);
        System.out.println();



        //3.read(byte[] buffer),读取多个字节放入buffer中，个数取决与buffer大小和文件剩余字节数。
        // 返回读取到的字节个数，读空返回-1.
        InputStream is2 = new FileInputStream("module03/IOStreamTest/B.txt");
        byte[] buffer = new byte[3]; //每次读取三个字节
        System.out.println(is2.read(buffer));

        System.out.println(new String(buffer));  //解码后输出
        //System.out.println(is2.read(buffer));  //再次使用buffer字节数组存储流中的字节，新的内容会覆盖以前的
        //System.out.println(new String(buffer));   //可以看到只读取了两个字节，buffer的第三位还是第一次读取时的数据未被覆盖
        //需要读取多少字节，就倒出多少字节
        System.out.println(new String(buffer, 0, is2.read(buffer))); //从零开始倒出读取的字节数



        //流使用完毕后，必须关闭
        is2.close();
        fis1.close();
        fis2.close();
        is1.close();



    }
}
