package com.行为型模式.DEMO_观察者模式;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 16:23
 * @description: 具体观察者，实现抽象观察者定义的更新接口，以便在得到主题更改通知时更新自身的状态。
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
public class WeixinUser implements Observer {

    public String name;

    @Override
    public void update(String message) {
        System.out.println(name+message);
    }
}
