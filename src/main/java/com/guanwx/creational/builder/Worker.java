package com.guanwx.creational.builder;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/15 星期日 16:26
 * @Description:
 * @Version: 1.0
 */

public class Worker extends BuilderRoom{

    private Room room;

    public Worker() {
        room = new Room();
    }

    @Override
    void builderA() {
        room.setBuilderA("第一步");
        System.out.println("造房子第一步。");
    }

    @Override
    void builderB() {
        room.setBuilderB("第二步");
        System.out.println("造房子第二步。");
    }

    @Override
    void builderC() {
        room.setBuilderC("第三步");
        System.out.println("造房子第三步。");
    }

    @Override
    void builderD() {
        room.setBuilderD("第四步");
        System.out.println("造房子第四步。");
    }

    @Override
    Room getRoom() {
        return room;
    }


}
