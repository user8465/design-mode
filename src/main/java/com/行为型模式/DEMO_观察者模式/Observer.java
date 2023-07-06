package com.行为型模式.DEMO_观察者模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 16:22
 * @description: 抽象观察者，是观察者的抽象类，它定义了一个更新接口，使得在得到主题更改通知时更新自己。
 * @Version: 1.0
 **/
public interface Observer {
    void update(String message);
}
