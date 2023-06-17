package com.DEMO_工厂设计模式.demo1;


 abstract class Coffee {
    public abstract void getName();
    public void  addMilk(){
        System.out.println("加牛奶");
    };
    public void  addSugar(){
        System.out.println("加糖");
    };
}
