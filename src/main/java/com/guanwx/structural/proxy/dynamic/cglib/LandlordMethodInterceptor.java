package com.guanwx.structural.proxy.dynamic.cglib;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/19 星期四 5:43
 * @Description:
 * @Version: 1.0
 */

@Data
public class LandlordMethodInterceptor implements MethodInterceptor {

    private Landlord landlord;

    public LandlordMethodInterceptor() {
        this.landlord = new Landlord();
    }

    /**
     *
     * @param obj "this", the enhanced object ->（代理对象本身）
     * @param method intercepted Method
     * @param args argument array; primitive types are wrapped
     * @param proxy used to invoke super (non-intercepted method); may be called
     * as many times as needed
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        return method.invoke(landlord, args);
    }
}
