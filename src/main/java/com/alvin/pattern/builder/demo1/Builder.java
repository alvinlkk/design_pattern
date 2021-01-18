package com.alvin.pattern.builder.demo1;

/**
 * 抽象builder类
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-18 11:19 PM
 */
public abstract class Builder {
    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
