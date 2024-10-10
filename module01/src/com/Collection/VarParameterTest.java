package com.Collection;

import java.util.Arrays;

public class VarParameterTest {
    //可变参数，一种特殊的形式参数。在虚实结合后成为一个数组。
    //一个形参列表中只能有一个可变参数
    //可变参数必须出现在参数列表最后
    public static void main(String[] args) {
        fun();
        fun("a","b","c");

    }
    public static void fun(String... str){
        System.out.println(str.length); //打印该数组长度
        System.out.println(Arrays.toString(str));
        System.out.println("---------------------");
    }
}
