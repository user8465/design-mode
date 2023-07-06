package com.结构型模式.DEMO_装饰着模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-06-29 10:40
 * @description: 快餐类（抽象构件）
 * @Version: 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class FastFood {
    public String desc;

    public float money;

    public abstract float cost();
}
