package com.application;

import com.user.Address;
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
                .phone("18822224444")
                .address(Address.builder()
                        .zip("333100")
                        .name("江西省鄱阳县")
                        .build())
                .build();
        System.out.println(user.toString());
    }
}
