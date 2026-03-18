package com.guanwx.creational.builder;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/15 星期日 20:12
 * @Description:
 * @Version: 1.0
 */

public class BuilderMain {
    public static void main(String[] args) {

        Director director = new Director();
        Room room = director.builder(new Worker());
        System.out.println(room.toString());

    }

}
