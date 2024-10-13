package com.iostream.Demo.Demo01;

import java.io.*;

public class Test02 {
    //try-catch-resource
    public static void main(String[] args) {
        try (
                //这里只能放置资源对象，即实现了AutoCloseable接口的类对象
                //资源被用完后，自动调用其close方法完成资源的释放操作
                InputStream is = new FileInputStream("D:/Source/Picture/4.jpg");
                OutputStream os = new FileOutputStream("module03/IOStreamTest/1.jpg", true)
        ) {
            byte[] buffer = new byte[1024 * 100];  //一次拿1KB*100=100KB
            int len;  //最多读buffer长度的字节（此处为100KB）,又buffer长度不超过int可表示的范围
            while ((len = is.read(buffer)) != (-1)) {
                os.write(buffer, 0, len);   //读多少写多少
            }

        /*byte[] buffer = is.readAllBytes();
        os.write(buffer);*/
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
