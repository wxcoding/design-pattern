package com.guanwx.behavioral.strategy;

import java.util.Scanner;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 3:42
 * @Description: 策略模式
 * @Version: 1.0
 */

public class TestStrategy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String next = scanner.nextLine();

        // 根据用户输入，执行对应的方法(对应的策略)
        Sender bean = ConfigUtils.getBean(next, Sender.class);

        bean.send();


    }
}
