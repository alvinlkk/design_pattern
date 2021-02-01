package com.alvin.pattern.mediator;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 1:40 PM
 */
//抽象同事类
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name,Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }
}
