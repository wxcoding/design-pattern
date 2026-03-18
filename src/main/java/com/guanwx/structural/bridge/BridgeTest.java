package com.guanwx.structural.bridge;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/18 星期三 1:24
 * @Description:
 * @Version: 1.0
 */

public class BridgeTest {
    public static void main(String[] args) {

        Computer apple = new DeskTop(new Apple());
        apple.info();

    }
}
