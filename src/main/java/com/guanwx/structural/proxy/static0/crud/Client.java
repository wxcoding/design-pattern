package com.guanwx.structural.proxy.static0.crud;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/18 星期三 2:59
 * @Description:
 * @Version: 1.0
 */

public class Client {
    public static void main(String[] args) {

        UserServiceImpl userServiceImpl = new UserServiceImpl();

        // 未代理执行业务方法
        userServiceImpl.add();
        userServiceImpl.delete();
        userServiceImpl.update();
        userServiceImpl.query();

        System.out.println("=========================================");

        // aop思想 -> 单独代理类实现增强 -> 业务方法增加日志，不影响业务
        UserServiceProxy proxy= new UserServiceProxy(userServiceImpl);
        proxy.add();

    }
}
