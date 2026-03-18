package com.guanwx.structural.bridge;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/17 星期二 23:38
 * @Description:
 * @Version: 1.0
 */

public class Apple implements Brand{

    @Override
    public void info() {
        System.out.println("苹果产品");
    }

}
