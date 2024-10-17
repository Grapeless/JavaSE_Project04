package com.Thread.Method;

public class Test {
    public static void main(String[] args) {
        //1,2.run() , start()

        //3.设置线程名称
        //3.1 创建线程对象时设置
        Thread t1 = new MyThread("t1");
        System.out.println(t1.getName());
        //3.2 setName()
        Thread t2 = new MyThread();
        t2.setName("t2");
        System.out.println(t2.getName());

        //4.getName() 得到线程对象名称

        //5.获得当前执行该代码的线程对象
        Thread t3 = Thread.currentThread();

        //6.join() 让调用这个方法的线程先执行完
        Thread t4 = new MyThread("t4");
        try {
            t4.start();
            t4.join();
            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("main"+i);
        }

        //7.static sleep(Long ) 让调用这个方法的线程暂停
        t1.start();



    }

}
