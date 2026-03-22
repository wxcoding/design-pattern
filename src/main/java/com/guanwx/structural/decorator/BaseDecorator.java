package com.guanwx.structural.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 1:49
 * @Description:
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
public class BaseDecorator implements BaseInterface{

    private BaseInterface baseImpl1;

    @Override
    public void method1() {
        System.out.println("method1()执行前...");
        baseImpl1.method1();
        System.out.println("method1()执行后...");
    }
}
