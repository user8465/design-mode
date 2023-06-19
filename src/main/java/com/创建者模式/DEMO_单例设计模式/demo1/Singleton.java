package com.创建者模式.DEMO_单例设计模式.demo1;
/**
 * @program: juheTest
 * @author: 8465
 * @createTime: 2023-06-15 16:16
 * @description: 单例设计模式（静态方法）
 * @Version: 1.0
 **/
class Singleton {
    private Singleton() {
    }
    public static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}
