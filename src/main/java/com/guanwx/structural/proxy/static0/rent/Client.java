package com.guanwx.structural.proxy.static0.rent;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/18 星期三 2:36
 * @Description:
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {

        Proxy proxy = new Proxy(new Landlord());
        proxy.reet();

    }
}
