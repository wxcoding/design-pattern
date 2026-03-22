package com.guanwx.behavioral.obeserver;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/23 星期一 0:43
 * @Description:
 * @Version: 1.0
 */

public class TestObserver {
    public static void main(String[] args) {

        Subject mySubject = new MySubject();
        mySubject.add(new Observer1());
        mySubject.mainFlow();

    }
}
