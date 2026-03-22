package com.guanwx.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 2:01
 * @Description:
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
public class Computer {

    private CPU cpu;

    private Memory memory;

    private Disk disk;

    public void start() {
        System.out.println("Computer-启动...");
        cpu.start();
        memory.memory();
        disk.disk();
    }

}
