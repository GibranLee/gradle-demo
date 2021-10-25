package com.dalelee.gradledemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-04-20 20:58
 **/
public class RelectionTest {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.dalelee.gradledemo.reflection.ReflectionTest");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                //最后搞明白了是缺少setAccessible(true)方法，
                // 使用继承父类（AccessibleObject类）来的setAccessible()方法，来设置或取消访问检查，以达到访问私有对象的目的
                method.setAccessible(true);
                System.out.println(method.toGenericString());
                method.invoke(clazz.newInstance(),2);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
