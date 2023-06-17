package com.DEMO_单例设计模式.demo2;

/**
 * @program: juheTest
 * @author: 8465
 * @createTime: 2023-06-15 17:11
 * @description: 单例设计模式懒加载(线程安全)
 * @Version: 1.0
 **/
class Singleton1 {
    private Singleton1(){}

    private static volatile Singleton1 singleton1;

    /**
     * 加锁
     */

    public static Singleton1 getSingleton1() {

        if (singleton1 == null){
            synchronized (Singleton1.class){
                if (singleton1 == null ){
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }

    /**
     * 加锁
     */
    public static synchronized  Singleton1 getInstance(){
        if (singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
