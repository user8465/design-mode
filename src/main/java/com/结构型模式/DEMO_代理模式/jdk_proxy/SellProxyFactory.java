package com.结构型模式.DEMO_代理模式.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-19 16:47
 * @description: 代理工厂，用来创建代理对象
 * @Version: 1.0
 **/
public class SellProxyFactory {
    private  TrainStation station = new TrainStation();

    public  SellTickets getSellTickets(){

        /**
         ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
         Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
         InvocationHandler h ： 代理对象的调用处理程序
         */
        SellTickets sellTickets =(SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object invoke = method.invoke(station, args);
                        System.out.println("请支付100元");
                        return invoke;
                    }
                }
        );
        return sellTickets;
    }
}
