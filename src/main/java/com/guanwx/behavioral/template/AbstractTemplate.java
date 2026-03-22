package com.guanwx.behavioral.template;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 4:36
 * @Description: 模版方法模式
 * @Version: 1.0
 */

public abstract class AbstractTemplate {

    // 子类需实现方法
    public abstract int calculate(int num1, int num2);

    // 主方法
    public final int mainMethod(String string, String reg) {
        String[] split = string.split(reg);
        int[] ints = new int[2];
        ints[0] = Integer.parseInt(split[0]);
        ints[1] = Integer.parseInt(split[1]);
        return calculate(ints[0], ints[1]);
    }
}
