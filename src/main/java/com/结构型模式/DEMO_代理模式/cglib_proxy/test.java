package com.结构型模式.DEMO_代理模式.cglib_proxy;

/**
 * @Author tanyu
 * @Date 2023/6/19 22:45
 * @PackageName: com.结构型模式.DEMO_代理模式.cglib_proxy
 * @ClassName: test
 * @Description: TODO
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.vip();
    }
}
