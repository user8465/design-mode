package com.DEMO_建造者模式.demo1;

/**
 * @Author tanyu
 * @Date 2023/6/18 21:43
 * @PackageName: com.DEMO_建造者模式.demo1
 * @ClassName: test
 * @Description: TODO
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Director director = new Director(new MoBikeBuilder());
        Bike bike = director.creatBike();
        System.out.println("这是一辆"+bike.getFrame()+bike.getSeat()+"单车");
    }



}
