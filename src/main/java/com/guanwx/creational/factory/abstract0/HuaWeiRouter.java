package com.guanwx.creational.factory.abstract0;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/14 星期六 0:59
 * @Description:
 * @Version: 1.0
 */

public class HuaWeiRouter implements RouterProduct{

    @Override
    public void start() {
        System.out.println("华为路由开机。");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由关机。");
    }

    @Override
    public void wifi() {
        System.out.println("华为路由连接WiFi。");

    }

    @Override
    public void setting() {
        System.out.println("华为路由设置。");
    }
}
