package com.Thread.createThread.Test02;

public class Test {
    public static void main(String[] args) {
        //3.创建一个任务对象
        Runnable r = new MyThread();
        //4.将任务对象交给线程对象处理
        new Thread(r).start();

        //简化写法1
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("匿名内部类创建的子线程" + i);
                }
            }
        }).start();

        //简化写法2
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("lambda表达式简化的匿名内部类创建的子线程" + i);
            }
        }).start();


        for (int i = 0; i < 5; i++) {
            System.out.println("主线程" + i);
        }
    }
}
