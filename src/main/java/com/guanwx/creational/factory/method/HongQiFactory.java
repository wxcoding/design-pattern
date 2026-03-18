package com.guanwx.creational.factory.method;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/13 星期五 23:37
 * @Description:
 * @Version: 1.0
 */

public class HongQiFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new HongQi();
    }

}
