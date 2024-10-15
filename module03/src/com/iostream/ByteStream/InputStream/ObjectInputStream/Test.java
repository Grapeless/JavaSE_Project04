package com.iostream.ByteStream.InputStream.ObjectInputStream;

import com.iostream.ByteStream.OutputStream.ObjectOutputStream.Student;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test {
    //对象字节输入流，对java对象反序列化，把存储在文件中的Java对象读入到内存中
    public static void main(String[] args) {
        try (
                ObjectInputStream ois = new ObjectInputStream
                        (new FileInputStream("module03/IOStreamTest/I.txt"))
        ) {

            //2.
            Student s = (Student) ois.readObject();
            System.out.println(s);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
