package com.行为型模式.DEMO_职责链模式;

/**
 * @program: design-mode
 * @author: 8465
 * @createTime: 2023-07-06 14:56
 * @description: todo
 * @Version: 1.0
 **/

public abstract class Handle {
    protected final static int NUMBER_DAY_ONE = 3;
    protected final static int NUMBER_DAY_TWO = 5;
    protected final static int NUMBER_DAY_THREE = 7;

    protected int day_start;
    protected int day_end;

    public Handle(int day_start, int day_end) {
        this.day_start = day_start;
        this.day_end = day_end;
    }

    public Handle nextHandle;

    public void setNextHandle(Handle nextHandle){
        this.nextHandle = nextHandle;
    };

    public abstract void leaveHandle(LeaveRequest leaveRequest);

    /**
     * @param leaveRequest
     */
    public void submit(LeaveRequest leaveRequest){
        if (0 == leaveRequest.day){
            return;
        }
        if (this.nextHandle != null && this.day_end < leaveRequest.day){
            System.out.println(getClass().getName().split("\\.")[3]+"暂无权限");
            this.nextHandle.submit(leaveRequest);
        }else {
            System.out.println(getClass().getName().split("\\.")[3]+"通过请求");
        }
    }

}
