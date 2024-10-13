package com.iostream.Encoding_Decoding;

import java.util.Arrays;

public class Test {
    //字符编码时使用的字符集必须和解码时使用的字符集保持一致，否则会出现乱码
    //英文和数字一般不会乱码，因为其他字符集兼容ASCII编码

    //ASCII（字符集兼编码方案）：只有英文，数字，符号等。每个字符占一个字节
    //GBK（字符集兼编码方案）：汉字占两个字节，英文，数字占一个字节
    //UTF-8(Unicode的一种编码方案）:汉字占三个字节，英文，数字占一个字节

    //Java默认使用utf-16，使得Java中char变量的两个字节能表示完BMP(2^(2*8))(2个字节)的6.5k+个字符。
    //而BMP中汉字大部分能被正常表示,超出其范围的汉字才需要使用代理对，即两个字符变量（4字节）表示


    public static void main(String[] args) throws Exception{
        //1.默认使用平台字符集进行编码
        String encodingStr = "A我B";
        byte[] bytes1 = encodingStr.getBytes();  //(此处为UTF-8)
        System.out.println(Arrays.toString(bytes1));  //5字节

        //2.指定字符集进行编码
        byte[] bytes2 = encodingStr.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));  //4字节

        //3.使用平台字符集解码
        String decodingStr1 = new String(bytes1);    //对字节数组bytes1使用平台默认字符集进行解码
        System.out.println(decodingStr1);

        //4.指定字符集进行解码
        String decodingStr2 = new String(bytes2,"GBK");    //注意编码和解码使用的字符集一致
        System.out.println(decodingStr2);

    }
}
