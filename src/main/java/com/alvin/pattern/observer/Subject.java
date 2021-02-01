package com.alvin.pattern.observer;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 9:25 AM
 */
public interface Subject {
    //增加订阅者
    void attach(Observer observer);

    //删除订阅者
    void detach(Observer observer);

    //通知订阅者更新消息
   void notify(String message);
}
