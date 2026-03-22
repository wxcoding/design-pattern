package com.guanwx.structural.adapter.class0;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/17 星期二 21:12
 * @Description:
 * @Version: 1.0
 */

// 实际适配器
@AllArgsConstructor
public class Adapter extends BaseAdapter implements BaseToUSB {

    @Override
    public void handlerRequest() {
        super.request();
    }

}
