package com.dalelee.gradledemo.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-05-03 17:21
 **/
public class CgLibProxy {
    public static void main(String[] args) {
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer = new Enhancer();

        //设置目标类的字节码文件
        enhancer.setSuperclass(Dog.class);
        //设置回调函数
        enhancer.setCallback(new MyMethodInterceptor());
        //这里的creat方法就是正式创建代理类
        Dog proxyDog = (Dog)enhancer.create();
        //调用代理类的eat方法
        proxyDog.eat();
    }
}
