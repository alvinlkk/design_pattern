package com.alvin.pattern.builder.demo2;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-18 11:25 PM
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .mainboard("华硕")
                .memory("金士顿")
                .screen("三星")
                .build();
        System.out.println(phone);
    }
}
