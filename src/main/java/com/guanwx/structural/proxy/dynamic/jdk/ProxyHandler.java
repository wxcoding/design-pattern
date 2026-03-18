package com.guanwx.structural.proxy.dynamic.jdk;

import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/18 星期三 3:36
 * @Description:
 * @Version: 1.0
 */

@Data
public class ProxyHandler implements InvocationHandler {

    // 被代理的接口
    private Object target;

    // 生成代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }
}
