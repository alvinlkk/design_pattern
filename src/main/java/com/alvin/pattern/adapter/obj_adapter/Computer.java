package com.alvin.pattern.adapter.obj_adapter;

/**
 * 电脑类
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 3:36 PM
 */
public class Computer {
    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw new NullPointerException("sd card null");
        }
        return sdCard.readSD();
    }
}
