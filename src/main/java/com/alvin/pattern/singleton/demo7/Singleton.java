package com.alvin.pattern.singleton.demo7;

/**
 * 懒汉式: 静态内部类
 *
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-18 10:26 PM
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }


}
