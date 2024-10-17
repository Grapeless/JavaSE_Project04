package com.Thread.ThreadSynchronization;

//ctrl+left click

public class Test {
    //1.同步代码块
    //2.同步方法
    //3.Lock锁
    public static void main(String[] args) {
        Account acc = new Account("ICBC-123",100);
        new ThreadTest(acc,"A1").start();
        new ThreadTest(acc,"A2").start();
    }
}
