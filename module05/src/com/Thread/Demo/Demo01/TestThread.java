package com.Thread.Demo.Demo01;

public class TestThread extends Thread {
    public static int sum = 1;

    @Override
    public void run() {
        if (sum >= 1) {
            sum -= 1;
        }
    }
}
