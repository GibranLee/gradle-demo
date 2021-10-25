package com.dalelee.gradledemo.optional;

import com.dalelee.gradledemo.entity.bean.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-09-01 13:49
 **/
public class TestOPtional {
    public static void main(String[] args) {
        /**
         * of 方法 ：将指定值用Optional封装之后返回，如果该值为null，则抛出一个NullPointerException异常
         *
         * ofNullable 方法 ：将指定值用Optional封装之后返回，如果该值为null，则返回一个空的Optional对象
         *
         * empty 方法 ：返回一个空的Optional实例
         *
         * filter 方法 ：如果值存在并且满足提供的谓词，就返回包含该值的Optional对象；否则返回一个空的 Optional对象
         *
         * flatMap 方法 ：如果值存在，就对该值执行提供的mapping函数调用，返回一个Optional类型的值，否则就返 回一个空的Optional对象
         *
         * get 方法 ：如果该值存在，将该值用Optional封装返回，否则抛出一个NoSuchElementException异常
         *
         * ifPresent 方法 ：如果值存在，就执行使用该值的方法调用，否则什么也不做
         *
         * isPresent 方法 ：如果值存在就返回true，否则返回false
         *
         * map 方法 ：如果值存在，就对该值执行提供的mapping函数调用
         *
         * orElse 方法：如果有值则将其返回，否则返回一个默认值
         *
         * orElseGet 方法 ：如果有值则将其返回，否则返回一个由指定的Supplier接口生成的值
         *
         * orElseThrow 方法 ：如果有值则将其返回，否则抛出一个由指定的Supplier接口生成的异常
         *
         */
        //User user = usersMapper.selectUserById(userId);
        User user = new User();
        user.setId(1L);
        user.setUsername("VIP");
        user.setAge(11);
        Optional<User> userO1 = Optional.ofNullable(user);
        userO1.map(User::getUsername)
                .ifPresent(username -> {
                    System.out.println("username不为空");
                });

        User user2 = new User();
        user2.setId(1L);
        user2.setUsername("VIP");
        Optional<User> userO2 = (Optional<User>) Optional.ofNullable(user2);

        if (userO1.equals(userO2)) {
            System.out.println("userO1 euqals userO2");
        } else {
            System.out.println("userO1 not euqals userO2");
        }

        if (userO1 == userO2) {
            System.out.println("userO1 equals userO2");
        } else {
            System.out.println("userO1 not equals userO2");
        }

        userO1.filter(user1 ->
                {
                    return user1.getUsername() != null;
                }

        ).ifPresent(user1 -> {
            System.out.println("userO1 notnull: true");
        });

        userO1.filter(User::notNull).ifPresent(user1 -> {
            System.out.println("userO1 notnull: true");
        });

        userO1.filter(User::notNull).map(User::getUsername).ifPresent(s -> {
            System.out.println("userO1 username not null: "+s);
        });

    }
}
