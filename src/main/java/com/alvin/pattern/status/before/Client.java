package com.alvin.pattern.status.before;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 9:07 AM
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILift.STOPPING_STATE);//电梯是停止的
        lift.open();//开门
        lift.close();//关门
        lift.run();//运行
        lift.stop();//停止
    }
}
