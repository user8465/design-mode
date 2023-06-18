package com.DEMO_建造者模式.demo1;

/**
 * @Author tanyu
 * @Date 2023/6/18 21:24
 * @PackageName: com.DEMO_建造者模式.demo1
 * @ClassName: Bike
 * @Description: TODO
 * @Version 1.0
 */
public class Bike {
    private String frame;
    private String seat;

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
    public String getFrame() {
        return frame;
    }
}
