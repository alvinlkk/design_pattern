package com.alvin.pattern.singleton.demo1;

/**
 * 饿汉式: 静态变量创建类的对象
 *
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-18 10:26 PM
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {}

    //在成员位置创建该类的对象
    private static Singleton instance = new Singleton();

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return instance;
    }


}
