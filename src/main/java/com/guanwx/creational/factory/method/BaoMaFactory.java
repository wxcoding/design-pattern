package com.guanwx.creational.factory.method;

import com.guanwx.creational.factory.simple.BaoMa;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/13 星期五 23:40
 * @Description:
 * @Version: 1.0
 */

public class BaoMaFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new BaoMa();
    }

}
