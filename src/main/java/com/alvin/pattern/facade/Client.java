package com.alvin.pattern.facade;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 11:09 PM
 */
public class Client {
    public static void main(String[] args) {
        //创建外观对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //客户端直接与外观对象进行交互
        facade.say("打开家电");
        facade.say("关闭家电");
    }
}
