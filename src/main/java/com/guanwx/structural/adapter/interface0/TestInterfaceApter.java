package com.guanwx.structural.adapter.interface0;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/17 星期二 21:28
 * @Description:
 * @Version: 1.0
 */

public class TestInterfaceApter {

    public void net (BaseToUSB baseToUSB) {
        baseToUSB.handlerRequest();
    }

    public static void main(String[] args) {

        BaseToUSB base1 = new Base1();
        base1.method2();
        base1.handlerRequest(); // 运行时调用抽象父类，为空，无实现

        BaseToUSB base2 = new Base2();
        base2.handlerRequest();
        base2.method2(); // 运行时调用抽象父类，为空，无实现

    }

}
