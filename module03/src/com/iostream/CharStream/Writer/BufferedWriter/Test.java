package com.iostream.CharStream.Writer.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test {
    //字符缓冲输出流
    public static void main(String[] args) {
        try(
                Writer writer = new FileWriter("module03/IOStreamTest/E.txt",true);
                //1.缓冲流自带8kb缓冲池
                BufferedWriter bw = new BufferedWriter(writer)
                ){
            bw.write('A');
            char[] chars = {'a','b','c'};
            bw.write(chars);

            //2.newLine() 直接写入一个换行
            bw.newLine();

            bw.write("被换行");
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
