package com.Thread.createThread.Test03;

import java.util.concurrent.Callable;

//1.//1.让该类实现Callable<E>接口
public class MyThread implements Callable<Integer> {
    private int n;

    public MyThread(int n) {
        this.n = n;
    }

    //2.重写其call()方法
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            sum += i;
        }
        return sum;
    }
}
