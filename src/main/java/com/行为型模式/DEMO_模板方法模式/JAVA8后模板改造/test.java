package com.行为型模式.DEMO_模板方法模式.JAVA8后模板改造;

import java.math.BigDecimal;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 11:10
 * @description: todo
 * @Version: 1.0
 **/
public class test {
    public static void main(String[] args) {
        BankBusinessHandler bankBusinessHandler = new BankBusinessHandler();
        bankBusinessHandler.vipSave(new BigDecimal(100));
        bankBusinessHandler.svipSave(new BigDecimal(100));
    }
}
