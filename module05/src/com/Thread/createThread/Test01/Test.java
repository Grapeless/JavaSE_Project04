package com.Thread.createThread.Test01;

public class Test {
    //main方法是一条默认的线程
    public static void main(String[] args) {
        //3.创建线程类对象代表一个线程
        Thread t = new MyThread();
        //4.启动线程（自动执行其run()方法）
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程："+i);
        }
    }
}
