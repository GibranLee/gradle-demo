package com.dalelee.gradledemo.atomic.threadsafe;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-10-20 14:45
 **/
@Slf4j(topic = "c.HappensBeforeTest")
public class HappensBeforeTest {
    static int a = 0;
    static boolean finish = false;

    public static void main(String[] args) {
        Thread t1 = new Thread("t1"){
            @Override
            public void run() {
                if(finish){
                    log.debug("a*a："+a*a);
                }
            }
        };

        Thread t2 = new Thread("t2"){
            @Override
            public void run() {
                a = 2;
                finish = true;
            }
        };

        t2.start();
        t1.start();
    }
}