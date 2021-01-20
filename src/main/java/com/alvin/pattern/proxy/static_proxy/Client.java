package com.alvin.pattern.proxy.static_proxy;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-20 11:15 PM
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint pp = new ProxyPoint();
        pp.sell();
    }
}
