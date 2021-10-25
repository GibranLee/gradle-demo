package com.dalelee.gradledemo.atomic.threadsafe;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-10-20 14:28
 **/
@Slf4j
public class ThreadSafe02 {
    private static boolean run = true;

    public static void main(String[] args) throws InterruptedException {
        Thread My_Thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (run) {

                }
            }
        }, "My_Thread");
        My_Thread.start();  //启动My_Thread线程
        log.debug(Thread.currentThread().getName()+"正在休眠@"+new SimpleDateFormat("hh:mm:ss").format(new Date())+"--"+run);
        Thread.sleep(1000);  //主线程休眠1s
        run = false;  //改变My_Thread线程运行条件
        log.debug(Thread.currentThread().getName()+"正在运行@"+new SimpleDateFormat("hh:mm:ss").format(new Date())+"--"+run);
    }
}
