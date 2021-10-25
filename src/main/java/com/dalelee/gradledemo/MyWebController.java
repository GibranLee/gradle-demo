package com.dalelee.gradledemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: controller
 * @Author: lizhouyou
 * @Create: 2020-10-30 15:11
 **/
@RestController
public class MyWebController {

    @GetMapping(value = "/demo")
    public String serviceONe(){
        return "my gradle demo;";
    }
}
