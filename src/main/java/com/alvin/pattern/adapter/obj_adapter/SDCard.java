package com.alvin.pattern.adapter.obj_adapter;

/**
 * SD卡的接口
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 3:35 PM
 */
public interface SDCard {
    //读取SD卡方法
    String readSD();
    //写入SD卡功能
    void writeSD(String msg);
}
