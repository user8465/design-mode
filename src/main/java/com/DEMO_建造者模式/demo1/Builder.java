package com.DEMO_建造者模式.demo1;

/**
 * @Author tanyu
 * @Date 2023/6/18 21:34
 * @PackageName: com.DEMO_建造者模式.demo1
 * @ClassName: Bulider
 * @Description: TODO
 * @Version 1.0
 */
  abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();

    public abstract Bike creatBike();

}
