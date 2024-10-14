package com.iostream.CharStream.Reader.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test {
    //字符缓冲输入流
    public static void main(String[] args) {
        try (
                Reader reader = new FileReader("module03/IOStreamTest/D.txt");
                //1.缓冲流自带8kb缓冲池
                BufferedReader bReader = new BufferedReader(reader)
        ) {
            /*char[] buffer = new char[5];
            int len;
            while ((len = bReader.read(buffer)) != (-1)) {
                System.out.print(new String(buffer, 0, len));
            }*/

            //2.readLine() 读取一行
            String str;
            while ((str = bReader.readLine()) != null) {
                System.out.println(str);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
