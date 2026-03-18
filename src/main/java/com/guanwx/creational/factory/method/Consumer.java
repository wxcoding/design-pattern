package com.guanwx.creational.factory.method;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/13 星期五 22:34
 * @Description:
 * @Version: 1.0
 */

public class Consumer {
    public static void main(String[] args) {

        Car car1 = new HongQiFactory().getCar();
        Car car2 = new BaoMaFactory().getCar();

        car1.name();
        car2.name();

    }
}
