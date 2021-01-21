package com.alvin.pattern.adapter.obj_adapter;

/**
 * 适配器类
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 3:39 PM
 */
public class SDAdapterTF implements SDCard {
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }


    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
