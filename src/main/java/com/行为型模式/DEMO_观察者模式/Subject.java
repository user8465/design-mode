package com.行为型模式.DEMO_观察者模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 16:15
 * @description: 抽象主题，抽象主题角色把所有观察者对象保存在一个集合里，
 * 每个主题都可以有任意数量的观察者，抽象主题提供一个接口，可以增加和删除观察者对象。
 * @Version: 1.0
 **/
public interface Subject {
    /**
     * 订阅主题
     */
    void attach(Observer observer);

    /**
     * 删除主题
     */
    void detach(Observer observer);

    /**
     *
     * @param message 通知内容
     */
    void notify(String message);
}
