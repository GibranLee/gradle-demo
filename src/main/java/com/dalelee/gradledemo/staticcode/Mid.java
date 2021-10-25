package com.dalelee.gradledemo.staticcode;

/**
 * @Description: 测试Mid
 * @Author: lizhouyou
 * @Create: 2021-03-08 13:49
 **/
public class Mid extends Root{
    static{
        System.out.println("Mid的静态初始化块");
    }

    {
        System.out.println("Mid的普通初始化块");
    }

    public Mid(){
        System.out.println("Mid的五参数构造器");
    }

    public Mid (String msg){
        //通过this来调用同一类中重载的构造器
        this();
        System.out.println("Mid的带参数构造器，其参数值："+msg);
    }
}
