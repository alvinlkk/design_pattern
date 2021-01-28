package com.alvin.pattern.command;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-28 11:34 PM
 */
// 资深大厨类 是命令的Receiver
public class SeniorChef {
    public void makeFood(int num,String foodName) {
        System.out.println(num + "份" + foodName);
    }
}
