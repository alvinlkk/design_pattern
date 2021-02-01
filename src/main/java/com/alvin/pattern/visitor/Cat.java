package com.alvin.pattern.visitor;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 7:50 PM
 */
public class Cat implements Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，喵喵喵！！！");
    }
}