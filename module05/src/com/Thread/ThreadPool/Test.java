package com.Thread.ThreadPool;
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/concurrent/ExecutorService.html

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        //创建线程池对象
        //1.使用代表线程池的接口ExecutorService下的ThreadPoolExecutor实现类

        //构造器ThreadPoolExecutor(...)的七个形参
        /*
        int corePoolSize,
        int maximumPoolSize,
        long keepAliveTime,
        TimeUnit unit,
        BlockingQueue<Runnable> workQueue,   //LinkedBlockingQueue<>(),ArrayBlockingQueue<>()
        ThreadFactory threadFactory,
        RejectedExecutionHandler handler   //任务拒绝策略
        */
        //ctrl+left click 函数名查看参数列表
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8, TimeUnit.SECONDS
                , new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory()
                , new ThreadPoolExecutor.AbortPolicy());
        //core pool size?
        /*ExecutorService p = new ThreadPoolExecutor(1, 2, 2, TimeUnit.MILLISECONDS
                , new LinkedBlockingQueue<>(5), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r);
            }
        },new ThreadPoolExecutor.AbortPolicy());*/

        //ExecutorService.execute(),执行Runnable任务
         //单个线程只能start一次，但任务可被多个线程执行
       /* Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target); //至此三个主线程满，但任务队列未满，线程将被复用
        pool.execute(target);
        pool.execute(target);
        pool.execute(target); //至此任务队列满，将生成临时线程
        pool.execute(target); //使用额外的临时线程
        pool.execute(target);*/
        //pool.execute(target); //至此任务将被拒绝

        //ExecutorService.submit(),执行Callable任务,返回Future任务对象
        Future<String> f1 = pool.submit(new MyCallable(100));
        try {
            System.out.println(f1.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        pool.shutdown();               //等待所以任务完成后,关闭线程池
        //ExecutorService.shutdownNow() 立即关闭线程池,返回未完成任务的集合

        //2.使用Executors工具类。底层还是ThreadPoolExecutor实现类的对象
        /*
        ExecutorService pool1 = Executors.newFixedThreadPool( );
        ExecutorService pool2 = Executors.newSingleThreadExecutor();
        ExecutorService pool3 = Executors.newCachedThreadPool();
        ExecutorService pool4 = Executors.newScheduledThreadPool( );
        */

    }
}
