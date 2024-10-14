package com.iostream.ByteStream.InputStream.BufferedInputStream;

import java.io.*;

public class Demo {
    //字节缓冲输入/出流
    public static void main(String[] args) {
        try (

                InputStream is = new FileInputStream("D:/Source/Picture/4.jpg");
                OutputStream os = new FileOutputStream("module03/IOStreamTest/1.jpg", true);

                //缓冲流自带8kb缓冲池
                InputStream bis = new BufferedInputStream(is);
                OutputStream bos = new BufferedOutputStream(os)
        ) {

            byte[] buffer = new byte[1024 * 100];  //一次拿1KB*100=100KB
            int len;  //最多读buffer长度的字节（此处为100KB）,又buffer长度不超过int可表示的范围
            while ((len = bis.read(buffer)) != (-1)) {
                bos.write(buffer, 0, len);   //读多少写多少
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
