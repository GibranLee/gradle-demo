package com.dalelee.gradledemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GradleDemoApplicationTests {

    @Test
    void contextLoads() {
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);
    }

}
