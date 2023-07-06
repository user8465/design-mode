package com.结构型模式.DEMO_适配器模式.object_adapter;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-21 10:50
 * @description: &&
 * @Version: 1.0
 **/
public class test {

    public static void main(String[] args) {
        TFCard tfCard = new TFCardImp();
        Computer computer = new Computer(new CardAdapterHandle(tfCard));
        SDCard sdCard = computer.getSdCard();
        sdCard.writeCard("11");
        System.out.println(sdCard.readCard());
    }
}
