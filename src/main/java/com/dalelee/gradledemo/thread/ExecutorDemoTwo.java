package com.dalelee.gradledemo.thread;

import java.util.concurrent.*;

/**
 * @Description: shuttingdown类型
 * @Author: lizhouyou
 * @Create: 2020-12-15 14:17
 * @Description: 线程池还有任务在执行，关闭线程池，任务还没有全部结束，往线程池提交新任务，则会出现shutting down
 * 全部结束后再提交，则会出现terminated
 **/
public class ExecutorDemoTwo {
    public static void main(String[] args) {
        ExecutorService pool =
                new ThreadPoolExecutor(2, 2, 10000,
                        TimeUnit.MILLISECONDS, new LinkedTransferQueue<>());

        for (int i = 0; i < 10; i++) {
            pool.submit(new Task());
        }

        pool.shutdown();

//        try {
//            Thread.sleep(5000l);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        for(int i=0;i<10;i++) {
            pool.submit(new Task());
        }
    }

    private static class Task implements Callable<Integer> {
        public Integer call() {
            try {
                System.out.println(Thread.currentThread().getName() + " running...");
                //Thread.sleep(0000l);
            } catch(Exception e) {
                e.printStackTrace();
            }
            return 1;
        }
    }
}
