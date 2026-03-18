package com.guanwx.structural.proxy.dynamic.jdk;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/18 星期三 2:34
 * @Description:
 * @Version: 1.0
 */

public class Landlord implements Rent {

    @Override
    public void rent() {
        System.out.println("房东租房");
    }
}
