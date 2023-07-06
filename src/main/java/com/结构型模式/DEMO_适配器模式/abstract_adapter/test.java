package com.结构型模式.DEMO_适配器模式.abstract_adapter;

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
        Computer computer = new Computer(new CardAbstractAdapterHandle() {
            @Override
            public String readCard() {
                return super.readTFCard();
            }
            @Override
            public void writeCard(String msg) {
                super.writeTFCard(msg);
            }
        });


        SDCard sdCard = computer.getSdCard();
        sdCard.writeCard("11");
        System.out.println(sdCard.readCard());


    }
}
