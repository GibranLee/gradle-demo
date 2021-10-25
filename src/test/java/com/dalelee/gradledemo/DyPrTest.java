package com.dalelee.gradledemo;

import com.dalelee.gradledemo.dypr.Person;
import com.dalelee.gradledemo.dypr.StuInvocationHandler;
import com.dalelee.gradledemo.dypr.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Description: 接口
 * @Author: lizhouyou
 * @Create: 2021-04-21 00:49
 **/
public class DyPrTest {
    public static void main(String[] args) {
        System.out.println(243/100);
        //创建一个实例对象，被代理的对象
        Person zhangsan = new Student("张三");

        //创建一个与代理对象相关联的invocationhandler
        InvocationHandler stuHandler = new StuInvocationHandler<Person>(zhangsan);

        //创建一个代理对象stuProxy来代理zhangsan，代理对象的每个执行方法都会替换执行
        //invocationhandler中的invoke方法
        Person stuProxy = (Person) Proxy
                .newProxyInstance
                        (Person.class.getClassLoader(),new Class<?>[]{Person.class},stuHandler);

        //代理执行上交班费的方法
        stuProxy.giveMoney();



    }
}
