package com.行为型模式.DEMO_策略模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 14:10
 * @description: 具体策略，实现了抽象策略定义的接口，提供具体的算法实现或行为
 * @Version: 1.0
 **/
public class IdeaUtil implements Strategy {
    @Override
    public void userUtil() {
        System.out.println("使用idea");
    }
}
