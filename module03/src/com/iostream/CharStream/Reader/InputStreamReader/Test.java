package com.iostream.CharStream.Reader.InputStreamReader;

import java.io.*;

public class Test {
    //字符输入转换流
    //解决不同编码（代码编码和文本文件编码）时，字符流读取文本内容乱码的问题
    public static void main(String[] args) {
        try (
                //1.得到原始的文件字节输入流
                InputStream is = new FileInputStream("module03/IOStreamTest/F.txt");
                //2.使用字符输入转换流按照指定的字符集编码转换成字符输入流
                Reader isr = new InputStreamReader(is, "GBK");//不指定字符默认集使用代码编码
                //3.再使用该字符输入流或继续包装为缓冲字符输入流进行读取文件
                BufferedReader br = new BufferedReader(isr)
        ) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
