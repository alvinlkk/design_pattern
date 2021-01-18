package com.alvin.pattern.singleton.demo6;

/**
 * 懒汉式: 双重检测机制, 添加volatile防止指令重排序
 *
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-18 10:26 PM
 */
public class Singleton {

    // 私有构造方法
    private Singleton() {}

    //在成员位置创建该类的对象
    private static volatile Singleton instance;

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if(instance == null) {
            synchronized (Singleton.class) {
                //抢到锁之后再次判断是否为null
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
