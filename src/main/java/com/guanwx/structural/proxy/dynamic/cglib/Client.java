package com.guanwx.structural.proxy.dynamic.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/19 星期四 4:49
 * @Description: cglib 动态代理
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {

        // cglib 代理 通过 Enhancer
        Enhancer enhancer = new Enhancer();

        // 设置他的父类（被代理类）
        enhancer.setSuperclass(Landlord.class);

        // 设置方法拦截器
        enhancer.setCallback(new LandlordMethodInterceptor());

        // 创建代理类
        Landlord landlord = (Landlord)enhancer.create();

        // 使用代理类调用被代理的方法
        landlord.rent();


    }
}
