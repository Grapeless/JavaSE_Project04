package com.iostream.CharStream.Writer.FileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test {
    //文件字符输出流
    public static void main(String[] args) {
        try (
                //1.创建管道。多态，简化，同时设置追加或覆盖属性写法。
                Writer writer = new FileWriter("module03/IOStreamTest/E.txt",false)
        ) {
            //写入换行符  \r\n
            writer.write("\r\n");

            //2.1 write(int )
            writer.write(97);   //'a'
            writer.write('A');
            writer.write("\r\n");

            //2.2 writer(String )
            writer.write("String");
            writer.write("\r\n");

            //2.3 writer(String ,offset ,len )
            writer.write("ABC",1,2);
            writer.write("\r\n");

            //2.4 writer(char[] )
            char[] chars = {'1','2','3'};
            writer.write(chars);
            writer.write("\r\n");

            //2.5 writer(char[] ,offset,len)
            writer.write(chars,1,2);
            writer.write("\r\n");

            //需要关闭（关闭时会刷新一次）或刷新流以使放在缓冲区中的数据到文件中去
            //3.刷新流
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
