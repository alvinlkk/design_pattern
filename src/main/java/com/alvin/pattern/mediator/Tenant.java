package com.alvin.pattern.mediator;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 1:41 PM
 */
//具体同事类 承租人
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    //与中介者联系
    public void constact(String message){
        mediator.constact(message, this);
    }

    //获取信息
    public void getMessage(String message){
        System.out.println("租房者" + name +"获取到的信息：" + message);
    }
}