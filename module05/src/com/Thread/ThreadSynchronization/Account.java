package com.Thread.ThreadSynchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//public>protected>default>private
public class Account {
    private String ID;
    private int balance;
    //接口Lock下的ReentrantLock实现类
    private final Lock lock = new ReentrantLock();  //多态写法。

    public Account() {
    }

    public Account(String ID, int balance) {
        this.ID = ID;
        this.balance = balance;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    /*public void drawMoney(int num) {
        String tName = Thread.currentThread().getName();
        ////同步代码块   synchronized（锁对象）{}
        //建议使用竞争进程的共享资源作为锁对象
        //对于实例方法建议使用this,对于静态方法建议使用字节码（类名.class)
        synchronized (this) {
            if (balance >= num) {
                System.out.println(tName + "来取钱" + num + "成功");
                balance -= num;
                System.out.println(tName+"取钱后，还剩余：" + balance);
            } else {
                System.out.println(tName + "来取钱，但余额不足");
            }
        }
    }*/

    //同步代码块与同步方法的优缺点：影响范围（性能），可读性

    /*
    //同步方法，在方法上使用synchronized关键字
    //隐含锁
    public synchronized void drawMoney(int num) {
        String tName = Thread.currentThread().getName();
        if (balance >= num) {
            System.out.println(tName + "来取钱" + num + "成功");
            balance -= num;
            System.out.println(tName+"取钱后，还剩余：" + balance);
        } else {
            System.out.println(tName + "来取钱，但余额不足");
        }
    }
    */
    public void drawMoney(int num) {
        String tName = Thread.currentThread().getName();
        try {
            //加锁
            lock.lock();
            if (balance >= num) {
                System.out.println(tName + "来取钱" + num + "成功");
                balance -= num;
                System.out.println(tName+"取钱后，还剩余：" + balance);
            } else {
                System.out.println(tName + "来取钱，但余额不足");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //解锁
            lock.unlock();
        }
    }

}
