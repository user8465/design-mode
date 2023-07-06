package com.结构型模式.DEMO_适配器模式.class_adapter;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-21 10:50
 * @description: &&
 * @Version: 1.0
 **/
public class test {

    public static void main(String[] args) {
        Computer computer = new Computer(new CardAdapterHandle());
        SDCard sdCard = computer.getSdCard();
        System.out.println(sdCard.readCard());


    }
}
