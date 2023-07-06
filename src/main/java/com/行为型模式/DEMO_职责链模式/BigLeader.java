package com.行为型模式.DEMO_职责链模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 15:11
 * @description: 具体处理者角色,大领导
 * @Version: 1.0
 **/
public class BigLeader extends Handle{

    public BigLeader() {
        super(Handle.NUMBER_DAY_TWO,Handle.NUMBER_DAY_THREE);
    }

    @Override
    public void leaveHandle(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.name+"请假"+leaveRequest.day+"天"+","+"请求原因是:"+leaveRequest.reason);
        submit(leaveRequest);
    }
}
