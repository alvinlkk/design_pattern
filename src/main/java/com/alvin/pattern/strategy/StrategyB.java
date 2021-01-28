package com.alvin.pattern.strategy;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-28 9:19 AM
 */
public class StrategyB implements Strategy {
    @Override
    public void show() {
        System.out.println("满200元减50元");
    }
}
