package com.guanwx.behavioral.strategy;

/**
 * @Author: guanwx
 * @CreateTime: 2026/9/7 星期一 20:15
 * @Description:
 * @Version: 1.0
 */

public class QQSender implements Sender{

    @Override
    public void send() {
        System.out.println("发送QQ消息");
    }
}
