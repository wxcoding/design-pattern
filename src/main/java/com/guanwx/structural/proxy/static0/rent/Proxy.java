package com.guanwx.structural.proxy.static0.rent;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/18 星期三 2:35
 * @Description:
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
public class Proxy implements Rent{

    private Landlord landlord;

    @Override
    public void reet() {
        landlord.reet();
    }
}
