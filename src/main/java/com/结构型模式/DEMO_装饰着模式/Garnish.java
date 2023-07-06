package com.结构型模式.DEMO_装饰着模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-29 10:46
 * @description: 装饰者类（抽象装饰）
 * @Version: 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Garnish extends FastFood {
    private FastFood fastFood;


    public Garnish(FastFood fastFood,String desc,float money){
        super(desc,money);
        this.fastFood = fastFood;
    }

}
