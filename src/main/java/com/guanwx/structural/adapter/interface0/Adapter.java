package com.guanwx.structural.adapter.interface0;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/17 星期二 21:12
 * @Description: 接口适配器
 * @Version: 1.0
 */

// 实际适配器
@Data
@AllArgsConstructor
public abstract class Adapter implements BaseToUSB {

    @Override
    public void handlerRequest() {

    }

    @Override
    public void method2() {

    }
}
