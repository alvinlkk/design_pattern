package com.alvin.pattern.singleton.demo3;

/**
 * 懒汉式: 线程不安全
 *
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-18 10:26 PM
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {}

    //在成员位置创建该类的对象
    private static Singleton instance;

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        //如果对象为空，创建对象
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}
