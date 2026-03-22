package com.guanwx.structural.adapter.class0;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/17 星期二 21:28
 * @Description:
 * @Version: 1.0
 */

public class Computer {

    public void net (BaseToUSB baseToUSB) {
        baseToUSB.handlerRequest();
    }

    public static void main(String[] args) {
        new Computer().net(new Adapter());
    }

}
