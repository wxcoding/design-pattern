package com.guanwx.creational.factory.simple;

import com.guanwx.creational.factory.method.Car;
import com.guanwx.creational.factory.method.HongQi;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/13 星期五 22:37
 * @Description: 简单工厂模式（静态工厂模式）
 * @Version: 1.0
 */

public class CarFactory {

    public static Car getCar(String car) {
        if ("红旗".equals(car)) {
            return new HongQi();
        } else if ("宝马".equals(car)) {
            return new BaoMa();
        } else {
            return null;
        }
    }

}
