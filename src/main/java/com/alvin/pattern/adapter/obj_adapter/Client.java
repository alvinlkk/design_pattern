package com.alvin.pattern.adapter.obj_adapter;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 3:38 PM
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("------------");

        TFCard tfCard = new TFCardImpl();
        SDAdapterTF adapter = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(adapter));
    }
}
