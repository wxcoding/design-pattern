package com.guanwx.structural.facade;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 2:09
 * @Description: 外观模式
 * @Version: 1.0
 */

public class TestFacade {
    public static void main(String[] args) {

        new Computer(new CPU(), new Memory(), new Disk()).start();

    }
}
