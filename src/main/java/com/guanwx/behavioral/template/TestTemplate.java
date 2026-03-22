package com.guanwx.behavioral.template;


/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 5:00
 * @Description:
 * @Version: 1.0
 */

public class TestTemplate {
    public static void main(String[] args) {

        AbstractTemplate plus = new Plus();
        int p = plus.mainMethod("4,1", ",");
        System.out.println(p);

        AbstractTemplate reduce = new Reduce();
        int r = reduce.mainMethod("4,1", ",");
        System.out.println(r);

    }
}
