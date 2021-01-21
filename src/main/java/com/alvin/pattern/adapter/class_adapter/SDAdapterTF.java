package com.alvin.pattern.adapter.class_adapter;

/**
 * 适配器类
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 3:39 PM
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
