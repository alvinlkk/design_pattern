package com.alvin.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 7:50 PM
 */
public class Home {
    private List<Animal> nodeList = new ArrayList<Animal>();

    public void action(Person person) {
        for (Animal node : nodeList) {
            node.accept(person);
        }
    }

    //添加操作
    public void add(Animal animal) {
        nodeList.add(animal);
    }
}