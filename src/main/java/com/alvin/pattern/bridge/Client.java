package com.alvin.pattern.bridge;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2021-01-21 11:04 PM
 */
//测试类
public class Client {
    public static void main(String[] args) {
        OperatingSystemVersion os = new Windows(new AVIFile());
        os.play("战狼3");
    }
}
