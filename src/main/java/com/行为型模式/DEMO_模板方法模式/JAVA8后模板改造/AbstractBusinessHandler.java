package com.行为型模式.DEMO_模板方法模式.JAVA8后模板改造;

import cn.hutool.core.lang.UUID;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 10:50
 * @description: todo
 * @Version: 1.0
 **/
public abstract class AbstractBusinessHandler {


    void execute(Supplier<String> stringSupplier, Consumer<BigDecimal> consumer,String evaluate){
        String executeName = stringSupplier.get();
        if (executeName.startsWith("vip")){
            System.out.println("黄金会员柜台");
        }else if (executeName.startsWith("svip")){
            System.out.println("砖石会员柜台");
        }else if (executeName.startsWith("reservation")){
            System.out.println("专属经理柜台");
        }else {
            getNum();
            System.out.println("普通会员");
        }
        consumer.accept(null);
        evaluate(evaluate);
    }

    /**
     * 取号
     */
    void getNum(){
        System.out.println(UUID.randomUUID().clockSequence());
    }

    void evaluate(String evaluate){
        System.out.println(evaluate);
    }
}
