package com.alvin.pattern.decorator;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 8:55 PM
 */
//培根配料
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {

        super(fastFood,2,"培根");
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}