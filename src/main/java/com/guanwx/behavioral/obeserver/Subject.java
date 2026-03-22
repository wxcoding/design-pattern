package com.guanwx.behavioral.obeserver;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/23 星期一 0:09
 * @Description:
 * @Version: 1.0
 */

public interface Subject {

    void add(Observer observer);

    void del(Observer observer);

    void notifyObservers();

    void operation();

    void mainFlow();

}
