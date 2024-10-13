package com.iostream.Reader.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Test {
    //文件字符输入流
    public static void main(String[] args) {
        try (
                //1.创建管道
                Reader reader = new FileReader("module03/IOStreamTest/C.txt");//多态，简化写法。
        ) {
            //2.read(),每次读取一个字符，返回该字符的 Unicode 码点，读空返回-1
            int c = reader.read();
            System.out.println((char) c);

            //3.read(byte[] buffer),读取多个字符放入buffer中，个数取决与buffer大小和文件剩余字符数。
            // 返回读取到的字符个数，读空返回-1.
            //FileReader 会根据文件的字符编码（如 UTF-8）将字节解码为 Java 中的 UTF-16 字符
            char[] buffer = new char[5];
            int len;
            while ((len = reader.read(buffer)) != (-1)) {
                System.out.print(new String(buffer, 0, len));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
