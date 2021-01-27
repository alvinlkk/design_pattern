package com.alvin.pattern.flyweight;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-27 8:57 PM
 */
public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状：" + this.getShape() + " 颜色：" + color);
    }
}
