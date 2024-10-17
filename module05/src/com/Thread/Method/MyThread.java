package com.Thread.Method;

public class MyThread extends Thread {
    public MyThread() {
    }

    //3.1
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 3; i++) {
            System.out.println(t.getName() + ":" + i);
            if (i == 1) {
                try {
                    //6.static sleep(Long )
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
