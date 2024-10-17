package com.Thread.ThreadSynchronization;

public class ThreadTest extends Thread{
    private Account acc;

    public ThreadTest(Account acc,String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(100);
    }
}
