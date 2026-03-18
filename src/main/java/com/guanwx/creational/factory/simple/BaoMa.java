package com.guanwx.creational.factory.simple;

import com.guanwx.creational.factory.method.Car;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/13 星期五 22:33
 * @Description:
 * @Version: 1.0
 */

public class BaoMa implements Car {

    @Override
    public void name() {
        System.out.println("宝马");
    }

}
