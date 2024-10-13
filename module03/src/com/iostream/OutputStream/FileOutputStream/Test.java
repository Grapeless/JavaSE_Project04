package com.iostream.OutputStream.FileOutputStream;


import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test {
    //文件字节输出流
    public static void main(String[] args) throws Exception {
        //1.创建流管道
        //不存在的文件会被创建
        OutputStream os =
                new FileOutputStream("module03/IOStreamTest/D.txt", true); //多态，简化写法。追加管道。
        //OutputStream os = new FileOutputStream("module03/IOStreamTest/D.txt"); //覆盖管道，先清空文件内容再写入

        //2.写入
        //2.1 write(int )
        os.write(97);
        //ASCII只有128个字符<一个字节2^8-1=255，字符类型 char 可以自动转换为 int
        os.write('A');

        //2.2 write(byte[] )
        byte[] bytes = "This is a sentence. 你我他".getBytes();
        os.write(bytes);

        //2.3 write(byte[] ,offset ,len )
        os.write(bytes, 20, 9);  //从第20个字节开始写入之后的9个字节


        //写入换行符 -  \r\n
        os.write("\r\n".getBytes());

        //关闭流
        os.close();
    }
}
