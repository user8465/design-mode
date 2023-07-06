package com.行为型模式.DEMO_职责链模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 15:06
 * @description: todo
 * @Version: 1.0
 **/
public class LittleLeader extends Handle{

    public LittleLeader() {
        super(Handle.NUMBER_DAY_ONE,Handle.NUMBER_DAY_TWO);
    }

    @Override
    public void leaveHandle(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.name+"请假"+leaveRequest.day+"天"+","+"请求原因是:"+leaveRequest.reason);
        submit(leaveRequest);
    }
}
