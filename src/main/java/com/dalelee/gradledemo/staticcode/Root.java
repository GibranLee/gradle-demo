package com.dalelee.gradledemo.staticcode;

/**
 * @Description: 测试ROOT类
 * @Author: lizhouyou
 * @Create: 2021-03-08 13:48
 **/
public class Root {

    static {
        System.out.println("Root的静态初始化块");
    }

    {
        System.out.println("Root的普通初始化块");
    }

    public Root() {
        System.out.println("Root的五参数构造器");
    }
}
