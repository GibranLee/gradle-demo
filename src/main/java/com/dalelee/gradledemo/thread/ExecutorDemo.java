package com.dalelee.gradledemo.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Description: terminated类型报错
 * @Author: lizhouyou
 * @Create: 2020-12-15 14:08
 * @Description: 线程池已关闭，往里面提交任务
 **/
public class ExecutorDemo {
    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(12);
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();
        List list = new ArrayList<>();

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        },"t1");

        ExecutorService pool =
                new ThreadPoolExecutor(2, 2, 1000,
                        TimeUnit.MILLISECONDS, new LinkedTransferQueue<>());

        pool.shutdown();

        Thread.sleep(5000l);
        for(int i=0;i<10;i++) {
            Thread.sleep(5000l);
            pool.submit(new Task());
            if (6==i){
                //pool.shutdown();
            }
        }
    }

    private static class Task implements Callable<Integer> {
        public Integer call() {
            try {
                System.out.println(Thread.currentThread().getName() + " running...");
                Thread.sleep(5000l);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        }
    }
}
