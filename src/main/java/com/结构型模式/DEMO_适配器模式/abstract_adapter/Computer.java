package com.结构型模式.DEMO_适配器模式.abstract_adapter;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-21 10:43
 * @description: 电脑类
 * @Version: 1.0
 **/
public class Computer {
    private SDCard sdCard;

    public Computer(SDCard sdCard){
        this.sdCard = sdCard;
    }

    public SDCard getSdCard() {
        return sdCard;
    }
//
//    public String readSD(SDCard sdCard) {
//        if(sdCard == null) {
//            throw new NullPointerException("sd card null");
//        }
//        return sdCard.readCard();
//    }
}
