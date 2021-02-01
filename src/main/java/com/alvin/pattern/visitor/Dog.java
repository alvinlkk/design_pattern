package com.alvin.pattern.visitor;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 7:49 PM
 */
public class Dog implements Animal {

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，汪汪汪！！！");
    }
}