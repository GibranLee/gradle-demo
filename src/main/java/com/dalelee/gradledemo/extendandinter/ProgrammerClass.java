package com.dalelee.gradledemo.extendandinter;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-05-26 11:54
 **/
public class ProgrammerClass implements Person {
    @Override
    public void doWhat() {
        System.out.println("dowhat......");
    }

    @Override
    public void doSome() {
        System.out.println("dosome......");
    }

    @Override
    public void doOne(Person p) {
        p.doSome();
    }
}
