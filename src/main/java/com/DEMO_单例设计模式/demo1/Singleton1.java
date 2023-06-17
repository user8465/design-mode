package com.DEMO_单例设计模式.demo1;

/**
 * @program: juheTest
 * @author: 8465
 * @createTime: 2023-06-15 16:16
 * @description: 单例设计模式（静态代码块）
 * @Version: 1.0
 **/
class Singleton1 {
    //私有构造方法
    private Singleton1() {}

    //在成员位置创建该类的对象
    private static Singleton1 instance;

    static {
        instance = new Singleton1();
    }

    //对外提供静态方法获取该对象
    public static Singleton1 getInstance() {
        return instance;
    }

}
