package com.dalelee.gradledemo.lombok.builder;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-09-16 09:59
 **/
public class User {
    private Integer id;
    private String name;
    private String address;

    private User() {
    }

    private User(User origin) {
        this.id = origin.id;
        this.name = origin.name;
        this.address = origin.address;
    }

    public static class Builder {
        private User target;

        public Builder() {
            this.target = new User();
        }

        public Builder id(Integer id) {
            target.id = id;
            return this;
        }

        public Builder name(String name) {
            target.name = name;
            return this;
        }

        public Builder address(String address) {
            target.address = address;
            return this;
        }

        public User build() {
            return new User(target);
        }
    }
}
