package com.行为型模式.DEMO_策略模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 14:12
 * @description: todo
 * @Version: 1.0
 **/
public class test {
    public static void main(String[] args) {
        UserMan userMan = new UserMan(new IdeaUtil());
        userMan.userUtil();
    }
}
