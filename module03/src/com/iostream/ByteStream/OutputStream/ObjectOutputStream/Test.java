package com.iostream.ByteStream.OutputStream.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {
    //对象字节输出流，对java序列化，存入到文件中去
    public static void main(String[] args) {
        try (
                //1.包装流
                ObjectOutputStream oos = new ObjectOutputStream
                        (new FileOutputStream("module03/IOStreamTest/I.txt"));
        ) {

            Student s = new Student("Lim",21);  //该类需要实现Serializable接口

            //2.
            oos.writeObject(s);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
