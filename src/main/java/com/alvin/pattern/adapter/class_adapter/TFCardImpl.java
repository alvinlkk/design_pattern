package com.alvin.pattern.adapter.class_adapter;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 3:37 PM
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg ="tf card read msg : hello word tf card";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
    }
}
