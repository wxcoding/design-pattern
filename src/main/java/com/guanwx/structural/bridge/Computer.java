package com.guanwx.structural.bridge;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/18 星期三 1:15
 * @Description:
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
public class Computer {

    private Brand brand;

    public void info() {
        brand.info();
    }

}

class DeskTop extends Computer {

    public DeskTop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机");
    }
}

class LapTop extends Computer {

    public LapTop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本");
    }
}


