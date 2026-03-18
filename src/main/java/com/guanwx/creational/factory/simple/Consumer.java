package com.guanwx.creational.factory.simple;


import com.guanwx.creational.factory.method.Car;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/13 星期五 22:34
 * @Description:
 * @Version: 1.0
 */

public class Consumer {
    public static void main(String[] args) {

        Car car1 = CarFactory.getCar("红旗");
        Car car2 = CarFactory.getCar("宝马");

        car1.name();
        car2.name();

    }
}
