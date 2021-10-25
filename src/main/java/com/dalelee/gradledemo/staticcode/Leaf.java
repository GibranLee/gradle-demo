package com.dalelee.gradledemo.staticcode;

/**
 * @Description: 测试leaf
 * @Author: lizhouyou
 * @Create: 2021-03-08 13:49
 **/
public class Leaf extends Mid{
    static{
        System.out.println("Leaf的静态初始化块");
    }

    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf(){
        //通过super调用父类中有一个字符串参数的构造器
        super("Java程序设计");
        System.out.println("执行Leaf的构造器");
    }
}
