package com.guanwx.behavioral.obeserver;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/23 星期一 0:29
 * @Description:
 * @Version: 1.0
 */

@Data
public abstract class AbstractSubject implements Subject{

    private List<Observer> list =new ArrayList<>();

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void del(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update();
        }
    }

    @Override
    public void mainFlow() {
        operation();
        notifyObservers();
    }
}
