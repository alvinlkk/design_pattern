package com.alvin.pattern.singleton.demo5;

/**
 * 懒汉式: 双重检测机制, 指令优化和重排序会导致空指针
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
