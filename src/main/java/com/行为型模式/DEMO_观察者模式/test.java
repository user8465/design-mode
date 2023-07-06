package com.行为型模式.DEMO_观察者模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 16:25
 * @description: todo
 * @Version: 1.0
 **/
public class test {
    public static void main(String[] args) {
        Subject subscriptionSubject = new SubscriptionSubject();

        WeixinUser weixinUser = new WeixinUser("孙悟空");
        WeixinUser weixinUser2 = new WeixinUser("贝吉塔");
        WeixinUser weixinUser3 = new WeixinUser("魔人布欧");

        subscriptionSubject.attach(weixinUser);
        subscriptionSubject.attach(weixinUser2);
        subscriptionSubject.attach(weixinUser3);

        subscriptionSubject.notify("龙珠在中国北京");
    }
}
