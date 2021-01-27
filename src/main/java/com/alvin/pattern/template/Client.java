package com.alvin.pattern.template;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-27 11:36 PM
 */
public class Client {
    public static void main(String[] args) {
        //炒手撕包菜
        ConcreteClass_BaoCai baoCai = new ConcreteClass_BaoCai();
        baoCai.cookProcess();

        //炒蒜蓉菜心
        ConcreteClass_CaiXin caiXin = new ConcreteClass_CaiXin();
        caiXin.cookProcess();
    }
}
