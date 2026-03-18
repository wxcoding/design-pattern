package com.guanwx.creational.factory.abstract0;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/14 星期六 1:12
 * @Description:
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {

        // 小米工厂
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();

        PhoneProduct phoneProduct = xiaoMiFactory.phoneProduct();
        phoneProduct.start();
        phoneProduct.shutdown();
        phoneProduct.call();
        phoneProduct.sendMessage();

        RouterProduct routerProduct = xiaoMiFactory.routerProduct();
        routerProduct.start();
        routerProduct.wifi();
        routerProduct.shutdown();
        routerProduct.setting();

    }
}
