package com.alvin.pattern.strategy;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-28 9:20 AM
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
    }
}
