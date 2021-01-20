package com.alvin.pattern.proxy.jdk_proxy;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-20 11:19 PM
 */
public class Client {
    public static void main(String[] args) {
        //获取代理对象
        ProxyFactory factory = new ProxyFactory();

        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
