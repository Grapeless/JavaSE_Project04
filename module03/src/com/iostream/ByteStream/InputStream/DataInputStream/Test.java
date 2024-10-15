package com.iostream.ByteStream.InputStream.DataInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    //数据输入流,读取数据及其类型
    public static void main(String[] args) {
        try (
                DataInputStream dis = new DataInputStream
                        (new FileInputStream("module03/IOStreamTest/H.txt"));
        ) {
            int i = dis.readInt();
            System.out.println(i);

            double v = dis.readDouble();
            System.out.println(v);

            boolean b = dis.readBoolean();
            System.out.println(b);

            String s = dis.readUTF();
            System.out.println(s);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
