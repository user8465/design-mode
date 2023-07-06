package com.行为型模式.DEMO_观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 16:19
 * @description: 具体主题，该角色将有关状态存入具体观察者对象，在具体主题的内部状态发生改变时，给所有注册过的观察者发送通知。
 * @Version: 1.0
 **/
public class SubscriptionSubject implements Subject {

    public List<Observer> observers = new ArrayList<>();


    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
