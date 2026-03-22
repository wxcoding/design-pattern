package com.guanwx.behavioral.strategy;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 3:28
 * @Description:
 * @Version: 1.0
 */

public class MsgSender implements Sender{

    @Override
    public void send() {
        System.out.println("发送短信");
    }
}
