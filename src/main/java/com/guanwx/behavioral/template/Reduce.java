package com.guanwx.behavioral.template;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 4:59
 * @Description:
 * @Version: 1.0
 */

public class Reduce extends AbstractTemplate{

    @Override
    public int calculate(int num1, int num2) {
        return num1 - num2;
    }
}
