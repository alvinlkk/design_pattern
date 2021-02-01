package com.alvin.pattern.visitor;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 7:42 PM
 */
public class Someone implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}