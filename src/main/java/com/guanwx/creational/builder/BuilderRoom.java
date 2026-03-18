package com.guanwx.creational.builder;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/15 星期日 16:14
 * @Description: 建造者模式
 * @Version: 1.0
 */

public abstract class BuilderRoom {

    abstract void builderA();
    abstract void builderB();
    abstract void builderC();
    abstract void builderD();

    abstract Room getRoom();

}
