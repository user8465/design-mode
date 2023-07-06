package com.行为型模式.DEMO_模板方法模式.JAVA8后模板改造;

import cn.hutool.core.lang.UUID;

import java.math.BigDecimal;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 11:03
 * @description: todo
 * @Version: 1.0
 **/
public class BankBusinessHandler extends AbstractBusinessHandler{
    /**
     * 存钱
     */
    void save(BigDecimal money){
        execute(() ->"Number-00"+ UUID.fastUUID().toString()
                ,a -> System.out.println("save"+money+"元"),"完美");
    }

    void vipSave(BigDecimal money){
        execute(() ->"vipNumber-00"+UUID.fastUUID().toString()
        ,a -> System.out.println("vipSave"+money+"元"),"完美"
        );
    }

    void svipSave(BigDecimal money){
        execute(() ->"svipNumber-00"+UUID.fastUUID().toString()
        ,a -> System.out.println("svipSave"+money+"元"),"完美"
        );
    }

}
