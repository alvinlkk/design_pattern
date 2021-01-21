package com.alvin.pattern.decorator;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 8:53 PM
 */
public class FriedRice extends FastFood {
    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
