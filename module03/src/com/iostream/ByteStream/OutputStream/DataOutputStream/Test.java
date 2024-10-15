package com.iostream.ByteStream.OutputStream.DataOutputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Test {
    //数据输出流,输出数据及其类型
    public static void main(String[] args) {
        try (
                DataOutputStream dos = new DataOutputStream
                        (new FileOutputStream("module03/IOStreamTest/H.txt"));
        ) {
            dos.writeInt(1);
            dos.writeDouble(5.5);
            dos.writeBoolean(true);
            dos.writeUTF("嘤嘤嘤");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
