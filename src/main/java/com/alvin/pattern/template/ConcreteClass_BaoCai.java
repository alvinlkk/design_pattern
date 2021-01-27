package com.alvin.pattern.template;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-27 11:34 PM
 */
public class ConcreteClass_BaoCai extends Cook {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
