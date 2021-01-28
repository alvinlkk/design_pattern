package com.alvin.pattern.strategy;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-28 9:19 AM
 */
public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("满1000元加一元换购任意200元以下商品");
    }
}
