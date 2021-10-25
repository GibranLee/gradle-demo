package com.dalelee.gradledemo.threadlocal;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-09-18 14:00
 **/
public class ThreadLocalId {

    private static final AtomicInteger nextId = new AtomicInteger(0);

    public static final ThreadLocal<Integer> threadId = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return nextId.getAndIncrement();
        }
    };

    public static int get(){
        return threadId.get();
    }

    public static void remove(){
        threadId.remove();
    }

    public static void incrementSameThreadId() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.printf(Thread.currentThread() + "" + i + ",threadId:" + ThreadLocalId.get());
            }
        } finally {
            ThreadLocalId.remove();
        }
    }
}
