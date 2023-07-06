package com.行为型模式.DEMO_职责链模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 15:13
 * @description: todo
 * @Version: 1.0
 **/
public class test {
    public static void main(String[] args) {
        LeaveRequest  leaveRequest = new LeaveRequest(6,"谭诗雨","去面试");
        //具体处理者
        LittleLeader  littleLeader = new LittleLeader();

        BigLeader bigLeader = new BigLeader();

        littleLeader.setNextHandle(bigLeader);

        littleLeader.leaveHandle(leaveRequest);
    }
}
