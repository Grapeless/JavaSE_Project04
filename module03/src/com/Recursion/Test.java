package com.Recursion;

public class Test {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    public static int f(int i) {
        if (i == 1) return 1;
        else return (f(i-1) + 1) * 2;
    }
}
