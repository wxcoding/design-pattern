package com.guanwx.creational.factory.abstract0;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/14 星期六 0:56
 * @Description:
 * @Version: 1.0
 */

public class HuaWeiPhone implements PhoneProduct{

    @Override
    public void start() {
        System.out.println("华为开机。");
    }

    @Override
    public void shutdown() {
        System.out.println("华为关机。");

    }

    @Override
    public void call() {
        System.out.println("华为打电话。");

    }

    @Override
    public void sendMessage() {
        System.out.println("华为发消息。");

    }
}
