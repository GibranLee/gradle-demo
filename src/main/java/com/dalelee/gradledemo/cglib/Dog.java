package com.dalelee.gradledemo.cglib;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-05-03 17:17
 **/
public class Dog {
    final public void run(String name) {
        System.out.println("狗"+name+"----run");
    }

    public void eat() {
        System.out.println("狗----eat");
    }
}
