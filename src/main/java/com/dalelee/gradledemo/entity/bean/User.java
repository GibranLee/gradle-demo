package com.dalelee.gradledemo.entity.bean;

import lombok.Data;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-09-01 13:41
 **/
@Data
public class User {

    private Long id;

    private String username;

    private Integer age;

    public boolean notNull(){
        return id != null && username != null && age != null;
    }
}
