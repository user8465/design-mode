package com.创建者模式.DEMO_工厂设计模式.demo2;


public abstract class Coffee {
    public abstract void getName();
    public void  addMilk(){
        System.out.println("加牛奶");
    };
    public void  addSugar(){
        System.out.println("加糖");
    };
}
