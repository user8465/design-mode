package com.创建者模式.DEMO_单例设计模式.demo2;

public class test {
//    public static void main(String[] args) {
//
//        new Thread(()->{
//            Singleton singleton2 = Singleton.getSingleton();
//            System.out.println(singleton2);
//        }).start();
//
////        for (int i = 0; i <10000000 ; i++) {
////
////            }
//        new Thread(()->{
//            Singleton singleton1 = Singleton.getSingleton();
//            System.out.println(singleton1);
//        }).start();
//
//    }
public static void main(String[] args) {

        new Thread(()->{
            Singleton1 singleton2 = Singleton1.getSingleton1();
            try {

                System.out.println( "线程1的："+singleton2);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();

    new Thread(()->{
        Singleton1 singleton2 = Singleton1.getSingleton1();
        System.out.println( "线程2的："+singleton2);


    }).start();
}
}
