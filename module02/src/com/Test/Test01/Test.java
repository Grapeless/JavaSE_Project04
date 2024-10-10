package com.Test.Test01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static final int V = 0;
    public static void main(String[] args) {
        /*boolean f = (0 + 1) / 2 != 0 ;
        System.out.println(f);*/
        /*String s = "abcab12";
        System.out.println(s.indexOf('1'));*/

        List<Integer> list = new ArrayList<>();
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

    }
}
