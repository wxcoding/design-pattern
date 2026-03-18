package com.guanwx.structural.proxy.dynamic.jdk;


/**
 * @Author: guanwx
 * @CreateTime: 2026/3/18 星期三 3:39
 * @Description:
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {

        ProxyHandler proxyHandler = new ProxyHandler();

        // 目标对象
        proxyHandler.setTarget(new Landlord());

        // 生成代理类
        Rent proxy = (Rent) proxyHandler.getProxy();

        proxy.rent();


    }
}
