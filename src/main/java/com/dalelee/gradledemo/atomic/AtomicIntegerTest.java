package com.dalelee.gradledemo.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description:
 * 为什么不加原子性时，count最终结果总是小于20000
 * 多个线程共同操作count，
 * 线程A,B,C一起累加，比如A遍历i加count到1000，那么A线程结束
 * B这时加到了900，结果i已经到1000，那么，B线程也结束，
 * 同理，C也是。
 *
 * 加了原子操作，
 * @Author: lizhouyou
 * @Create: 2021-10-19 17:27
 **/
public class AtomicIntegerTest {

    private static final int THREADS_COUNT = 20;
    public static AtomicInteger count = new AtomicInteger(20000);
    //public static volatile int count = 20000;

    public static void increase() {
        //count.incrementAndGet();
        //count++;
    }

    /**
     * 原子操作
     * count = 666 - 1;
     */
    public static void decrease(){
        count.decrementAndGet();
        //count--;
        //count = count - 1;
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 1000; i++) {
                        decrease();
                    }
                }
            });
            threads[i].start();
        }

        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println(count);
    }
}
