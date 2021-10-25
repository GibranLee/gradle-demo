package com.dalelee.gradledemo.thread;

import java.util.concurrent.*;

/**
 * @Description: running类型
 * @Author: lizhouyou
 * @Create: 2020-12-15 14:25
 **/
public class ExecutorDemoThree {
    public static void main(String[] args) {
        ExecutorService pool =
                new ThreadPoolExecutor(2,
                        2, 10000,
                        TimeUnit.MILLISECONDS, new SynchronousQueue<>());

        for (int i = 0; i < 10; i++) {
            pool.submit(new Task());
        }

        ThreadPoolExecutor pool1 = (ThreadPoolExecutor) pool;
        int queueSize = pool1.getQueue().size();

//        while (true){
//            try {
////                if (pool1.isTerminated()){
////                    System.out.println("isShutdown...");
////                    break;
////                }
//                System.out.println("getPoolSize: "+pool1.getPoolSize());
//                System.out.println("getActiveCount: "+pool1.getActiveCount());
//                System.out.println("getQueue: "+pool1.getQueue().size());
//                System.out.println("getCompletedTaskCount: "+pool1.getCompletedTaskCount());
//                System.out.println("_+_+_+_+_+_+_+_+_++__++_+_+_+_+_+_+_+_+_+_+_+_++_+__+_+_+__+");
//
//                Thread.sleep(1000l);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//                break;
//            }
//        }
    }

    private static class Task implements Callable<Integer> {
        public Integer call() {
            try {
                System.out.println(Thread.currentThread().getName() + " running...");
                Thread.sleep(10000l);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        }
    }
}
