package com.alvin.pattern.mediator;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 1:39 PM
 */
//抽象中介者
public abstract class Mediator {
    //申明一个联络方法
    public abstract void constact(String message, Person person);
}