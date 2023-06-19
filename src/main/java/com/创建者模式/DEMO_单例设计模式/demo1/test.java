package com.创建者模式.DEMO_单例设计模式.demo1;

public class test {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(1);
    }
}
