package com.创建者模式.DEMO_单例设计模式.demo2;

/**
 * @program: juheTest
 * @author: 8465
 * @createTime: 2023-06-15 16:16
 * @description: 单例设计模式懒加载（线程不安全）
 * @Version: 1.0
 **/
 class Singleton {
    private Singleton() {
    }
    public static Singleton singleton;

    public static Singleton getSingleton() {
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
