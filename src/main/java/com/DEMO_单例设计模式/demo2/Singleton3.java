package com.DEMO_单例设计模式.demo2;

/**
 * @program: juheTest
 * @author: 8465
 * @createTime: 2023-06-15 17:26
 * @description: 懒汉式-方式4（静态内部类方式）
 * @Version: 1.0
 **/
 class Singleton3 {
    private Singleton3(){}


    private static class  SingletonHandle{
        public static Singleton3 singleton3 = new Singleton3();
    }
    public static Singleton3 getSingleton(){
        return SingletonHandle.singleton3;
    }

}
