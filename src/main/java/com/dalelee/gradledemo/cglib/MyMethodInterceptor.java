package com.dalelee.gradledemo.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-05-03 17:17
 **/
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj,
                            Method method,
                            Object[] args,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println("这里是对目标类进行增强！！！");
        //注意这里的方法调用，不是用反射哦！！！
        Object object = methodProxy.invokeSuper(obj, args);
        return object;
    }
}
