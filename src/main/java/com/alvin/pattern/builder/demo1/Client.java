package com.alvin.pattern.builder.demo1;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-18 11:21 PM
 */
public class Client {
    public static void main(String[] args) {
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }
    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
