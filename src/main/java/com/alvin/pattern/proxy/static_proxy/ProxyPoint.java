package com.alvin.pattern.proxy.static_proxy;

/**
 * 代售点
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-20 11:14 PM
 */
public class ProxyPoint implements SellTickets {

    private TrainStation station = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费用");
        station.sell();
    }
}
