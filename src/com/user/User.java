package com.user;

import lombok.Builder;

/**
 * 这里用 @Builder 注解修饰 User 类。主要想看 lombok 是怎样实现 Builder 模式的。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/18 14:16
 */
@Builder
public class User {
    private String name;
    private int age;
    private String phone;
    private Address address;
}
