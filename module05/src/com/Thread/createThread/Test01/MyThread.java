package com.Thread.createThread.Test01;

//1.让该类继承Thread成为线程类
public class MyThread extends Thread{

    //2.重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程"+i);
        }
    }
}
