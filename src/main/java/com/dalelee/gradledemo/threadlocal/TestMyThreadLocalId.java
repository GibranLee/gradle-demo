package com.dalelee.gradledemo.threadlocal;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-09-18 14:09
 **/
public class TestMyThreadLocalId {
    public static void main(String[] args) {
        //main Thread
        ThreadLocalId.incrementSameThreadId();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadLocalId.incrementSameThreadId();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadLocalId.incrementSameThreadId();
            }
        }).start();


    }
}
