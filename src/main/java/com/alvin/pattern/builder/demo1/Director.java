package com.alvin.pattern.builder.demo1;

/**
 * 指挥者类
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-18 11:20 PM
 */
public class Director {
    private Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
