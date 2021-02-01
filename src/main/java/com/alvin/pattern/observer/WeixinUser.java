package com.alvin.pattern.observer;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 9:25 AM
 */
public class WeixinUser implements Observer {
    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}