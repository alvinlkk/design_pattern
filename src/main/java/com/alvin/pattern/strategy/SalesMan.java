package com.alvin.pattern.strategy;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-28 9:20 AM
 */
public class SalesMan {
    //持有抽象策略角色的引用
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //向客户展示促销活动
    public void salesManShow(){
        strategy.show();
    }
}
