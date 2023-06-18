package com.DEMO_建造者模式.demo1;

/**
 * @Author tanyu
 * @Date 2023/6/18 21:39
 * @PackageName: com.DEMO_建造者模式.demo1
 * @ClassName: MoBikeBulider
 * @Description: TODO
 * @Version 1.0
 */
public class MoBikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("钢铁");

    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮");
    }

    @Override
    public Bike creatBike() {
        return bike;
    }
}
