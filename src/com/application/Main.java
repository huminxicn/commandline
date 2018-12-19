package com.application;

import com.user.User;

/**
 * 构建 User 对象。
 *
 * @author hf huminxi2017@gmail.application
 * @version on 2018/12/18 14:17
 */
public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("小明")
                .age(13)
                .build();
    }
}
