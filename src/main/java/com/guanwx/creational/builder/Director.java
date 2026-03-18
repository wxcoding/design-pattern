package com.guanwx.creational.builder;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/15 星期日 17:43
 * @Description:
 * @Version: 1.0
 */

public class Director {

    public Room builder(BuilderRoom builderRoom) {

        builderRoom.builderA();
        builderRoom.builderB();
        builderRoom.builderC();
        builderRoom.builderD();

        return builderRoom.getRoom();
    }

}
