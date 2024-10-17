package com.Thread.createThread.Test02;

//1.让该类实现Runnable成为任务类
public class MyThread implements Runnable{
    //2.重写其run方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程："+i);
        }
    }
}
