package com.alvin.pattern.strategy;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-28 9:19 AM
 */
public class StrategyA implements Strategy {
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
