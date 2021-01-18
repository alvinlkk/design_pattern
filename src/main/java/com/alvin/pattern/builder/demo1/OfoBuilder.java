package com.alvin.pattern.builder.demo1;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-18 11:20 PM
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
