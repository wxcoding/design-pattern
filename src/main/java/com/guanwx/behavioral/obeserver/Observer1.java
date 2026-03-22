package com.guanwx.behavioral.obeserver;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/23 星期一 0:08
 * @Description:
 * @Version: 1.0
 */

public class Observer1 implements Observer{

    @Override
    public void update() {
        System.out.println("观察到变化-Observer1");
    }
}
