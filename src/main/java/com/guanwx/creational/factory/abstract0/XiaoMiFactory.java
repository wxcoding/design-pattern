package com.guanwx.creational.factory.abstract0;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/14 星期六 1:09
 * @Description:
 * @Version: 1.0
 */

public class XiaoMiFactory implements ProductFactory{

    @Override
    public PhoneProduct phoneProduct() {
        return new XiaoMiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new XiaoMiRouter();
    }
}
