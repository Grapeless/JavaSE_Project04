package com.Thread.ThreadPool;

import java.util.concurrent.Callable;

//1.//1.让该类实现Callable<E>接口
public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    //2.重写其call()方法
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "求出的结果：" + sum;
    }
}
