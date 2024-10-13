package com.iostream.Demo.Demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
    //复制文件（先读取文件到内存或一次全部存入数组，再写入另一个文件）
    //"D:\Source\Picture\4.jpg" -> module03/IOStreamTest/1.jpg
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("D:/Source/Picture/4.jpg");  //1.26MB
        //需要填写完整目标文件名
        OutputStream os = new FileOutputStream("module03/IOStreamTest/1.jpg", true);

        byte[] buffer = new byte[1024 * 100];  //一次拿1KB*100=100KB
        int len;  //最多读buffer长度的字节（此处为100KB）,又buffer长度不超过int可表示的范围
        while ((len = is.read(buffer)) != (-1)) {
            os.write(buffer, 0, len);   //读多少写多少
        }

        /*byte[] buffer = is.readAllBytes();
        os.write(buffer);*/

        is.close();
        os.close();
    }
}
