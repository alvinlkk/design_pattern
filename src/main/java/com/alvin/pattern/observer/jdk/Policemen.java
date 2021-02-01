package com.alvin.pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 9:41 AM
 */
public class Policemen implements Observer {

    private String name;

    public Policemen(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("警察：" + ((Thief) o).getName() + "，我已经盯你很久了，你可以保持沉默，但你所说的将成为呈堂证供！！！");
    }
}
