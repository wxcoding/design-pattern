package com.guanwx.creational.factory.abstract0;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/14 星期六 1:03
 * @Description: 抽象产品工厂
 * @Version: 1.0
 */

public interface ProductFactory {

    // 生产手机的工厂
    PhoneProduct phoneProduct();

    // 生产路由的工厂
    RouterProduct routerProduct();

}
