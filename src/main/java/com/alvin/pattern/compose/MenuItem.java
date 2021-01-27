package com.alvin.pattern.compose;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-27 1:27 PM
 */
public class MenuItem extends MenuComponent {
    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
