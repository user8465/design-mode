package com.行为型模式.DEMO_策略模式;

import lombok.Data;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 14:12
 * @description: 环境（Context）类：持有一个策略类的引用，最终给客户端调用
 * @Version: 1.0
 **/
@Data
public class UserMan {
    private Strategy strategy;

    public UserMan(Strategy strategy){
        this.strategy = strategy;
    }
    public void userUtil(){
        strategy.userUtil();
    }


}
