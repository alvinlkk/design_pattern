package com.alvin.pattern.proxy.cglib_proxy;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-20 11:19 PM
 */
public class Client {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();

        proxyObject.sell();
    }
}
