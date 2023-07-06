package com.行为型模式.DEMO_模板方法模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 10:30
 * @description: todo
 * @Version: 1.0
 **/
public class BubbleTea extends AbstractClass {
    @Override
    void addBurden() {
        System.out.println("加珍珠");
    }

    @Override
    void isIceOrHot(String para) {
        if ("加热".equals(para)){
            System.out.println("加热");
        }else if ("常温".equals(para)){
            System.out.println("常温");
        }else if ("加冰".equals(para)){
            System.out.println("加冰");
        }
    }
}
