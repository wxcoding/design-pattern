package com.guanwx.singleton;

/**
 * @Author: guanwx
 * @CreateTime: 2026/2/12 星期四 2:04
 * @Description: 饿汉式单例模式
 * @Version: 1.0
 */

public class Hungry {

    private static final Hungry hungry= new Hungry();

    private Hungry() {}

    private static Hungry getHungry(){
        return hungry;
    }
}
