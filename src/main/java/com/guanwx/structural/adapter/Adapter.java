package com.guanwx.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/17 星期二 21:12
 * @Description:
 * @Version: 1.0
 */

// 实际适配器
@Data
@AllArgsConstructor
public class Adapter implements BaseToUSB{

    private BaseAdapter baseAdapter;

    @Override
    public void handlerRequest() {
        baseAdapter.request();
    }

}
