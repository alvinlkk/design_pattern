package com.alvin.pattern.adapter.class_adapter;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 3:36 PM
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "sd card read a msg :hello word SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
    }
}
