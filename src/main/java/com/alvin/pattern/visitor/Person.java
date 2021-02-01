package com.alvin.pattern.visitor;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 7:42 PM
 */
public interface Person {
    void feed(Cat cat);

    void feed(Dog dog);
}
