package com.创建者模式.DEMO_建造者模式.demo1;

/**
 * @Author tanyu
 * @Date 2023/6/18 21:41
 * @PackageName: com.DEMO_建造者模式.demo1
 * @ClassName: Director
 * @Description: TODO
 * @Version 1.0
 */
public class Director {
    public  Builder builder ;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike creatBike(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.creatBike();
    }
}
