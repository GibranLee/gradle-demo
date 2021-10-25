package com.dalelee.gradledemo;

import com.dalelee.gradledemo.staticcode.Leaf;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-03-08 13:50
 **/
@SpringBootTest
public class StaticCodeTest {
    /**
     * 静态代码块 》 非静态代码块 》
     */
    @Test
    public void test1(){
        new Leaf();
        System.out.println("---------------");
        new Leaf();
    }

}
