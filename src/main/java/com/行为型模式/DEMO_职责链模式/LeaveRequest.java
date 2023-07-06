package com.行为型模式.DEMO_职责链模式;

import lombok.Data;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 14:53
 * @description: 请假条类
 * @Version: 1.0
 **/

@Data
public class LeaveRequest {
    int day;
    String name;
    String reason;

    public LeaveRequest(int day, String name, String reason) {
        this.day = day;
        this.name = name;
        this.reason = reason;
    }

}
