package com.alvin.pattern.builder.demo1;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-18 11:20 PM
 */
public class MobikeBuilder extends Builder {

    @Override
    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }

}
