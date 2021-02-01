package com.alvin.pattern.status.after;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-02-01 9:18 AM
 */
//测试类
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
