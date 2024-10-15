package com.iostream.ByteStream.OutputStream.PrintStream;

import java.io.*;
import java.nio.charset.Charset;

public class Test {
    public static void main(String[] args) {
        try (
                //1.创建一个打印流管道
                PrintStream ps = new PrintStream("module03/IOStreamTest/G.txt",  //String/File/OutputStream
                        Charset.forName("GBK"));
                //2.PrintWriter ps = new PrintWriter("module03/IOStreamTest/G.txt",Charset.forName("GBK"));  //用法几乎相同，除了它们的父类方法
                //3.指定追加或覆盖属性，在低级流中设置
                PrintStream ps1 = new PrintStream(new FileOutputStream("module03/IOStreamTest/G.txt",true))


        ) {
            ps.println(97);
            ps.println('a');

            ps.write(97);

            //4.系统输出语句重定向
            System.out.println("1");
            System.out.println("2");
            System.setOut(ps);    //之后System.out.println()会将打印的信息放到ps所指文件中去

            System.out.println("3");
            System.out.println("4");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
