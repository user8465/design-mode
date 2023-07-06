package com.行为型模式.DEMO_模板方法模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 10:19
 * @description: 抽象类
 * @Version: 1.0
 **/
public abstract class AbstractClass {

    /**
     *模板方法：定义了具体实现的步骤，按照固定顺序执行
     */
    void makeMilkTea(String parameter){
        addWater();
        addBurden();
        isIceOrHot(parameter);
        packaging();
    };

    /**
     *具体方法：固定实现的方法
     */
    void addWater(){
        System.out.println("加水");
    }

    void packaging(){
        System.out.println("装杯");
    }


    /**
     * 抽象方法：需要子类实现，来实现反向控制其行为
     */
    abstract void addBurden();

    abstract void isIceOrHot(String parameter);

}
