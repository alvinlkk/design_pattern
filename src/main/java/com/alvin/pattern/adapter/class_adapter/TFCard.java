package com.alvin.pattern.adapter.class_adapter;

/**
 * TF卡接口
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 3:37 PM
 */
public interface TFCard {
    //读取TF卡方法
    String readTF();
    //写入TF卡功能
    void writeTF(String msg);
}
