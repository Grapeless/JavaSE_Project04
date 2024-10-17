package com.Thread.createThread.Test03;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {
        //3.创建一个Callable对象
        Callable<Integer> c = new MyThread(100);

        //4.将该Callable对象封装为FutureTask对象（任务对象）
        FutureTask<Integer> f = new FutureTask<>(c);

        //5.将该任务对象交给Thread对象处理
        Thread t = new Thread(f);
        t.start();

        //6.调用FutureTask对象的get方法得到call方法的返回值
        try {
            int sum = f.get();  //这里会暂停至子线程计算sum执行完毕
            System.out.println(sum);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
