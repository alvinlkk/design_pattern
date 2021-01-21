package com.alvin.pattern.decorator;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 8:53 PM
 */
public class FriedNoodles extends FastFood {
    public FriedNoodles() {
        super(10, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
