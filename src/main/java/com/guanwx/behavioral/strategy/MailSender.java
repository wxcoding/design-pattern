package com.guanwx.behavioral.strategy;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 3:29
 * @Description:
 * @Version: 1.0
 */

public class MailSender implements Sender{

    @Override
    public void send() {
        System.out.println("发送邮件");
    }
}
