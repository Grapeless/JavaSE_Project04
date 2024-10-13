package com.iostream.Demo.Demo01;

import java.io.*;

public class Test01 {
    //try-catch-finally
    public static void main(String[] args) {
        InputStream is =null;
        OutputStream os =null;
        try {
            is = new FileInputStream("D:/Source/Picture/4.jpg");
            os = new FileOutputStream("module03/IOStreamTest/1.jpg", true);

            byte[] buffer = new byte[1024 * 100];  //一次拿1KB*100=100KB
            int len;  //最多读buffer长度的字节（此处为100KB）,又buffer长度不超过int可表示的范围
            while ((len = is.read(buffer)) != (-1)) {
                os.write(buffer, 0, len);   //读多少写多少
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (is != null) {    //防止资源还没利用即到赋值那一步而捕获了异常导致提前进入finally
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
