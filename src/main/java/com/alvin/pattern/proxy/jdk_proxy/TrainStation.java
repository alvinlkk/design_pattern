package com.alvin.pattern.proxy.jdk_proxy;

/**
 * //火车站  火车站具有卖票功能，所以需要实现SellTickets接口
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-20 11:13 PM
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
