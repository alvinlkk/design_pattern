package com.alvin.pattern.decorator;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 8:54 PM
 */
public abstract class Garnish extends FastFood {
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood, float price, String desc) {
        super(price,desc);
        this.fastFood = fastFood;
    }
}
