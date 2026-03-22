package com.guanwx.behavioral.obeserver;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/23 星期一 0:40
 * @Description:
 * @Version: 1.0
 */

public class MySubject extends AbstractSubject{

    @Override
    public void operation() {
        System.out.println("MySubject执行...");
    }
}
