package com.Thread.Demo.Demo01;

public class Test {
    public static void main(String[] args) throws Exception{
        Thread t1 = new TestThread();
        Thread t2 = new TestThread();

        t1.start();
        t2.start();



        Thread.sleep(1000);
        System.out.println(TestThread.sum);
    }
}
