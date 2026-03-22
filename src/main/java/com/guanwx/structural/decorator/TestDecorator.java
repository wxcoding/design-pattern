package com.guanwx.structural.decorator;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 1:53
 * @Description: 装饰器模式
 * @Version: 1.0
 */

public class TestDecorator {
    public static void main(String[] args) {

        BaseInterface baseDecorator = new BaseDecorator(new BaseImpl1());

        baseDecorator.method1();
    }
}
