package com.guanwx.structural.proxy.static0.crud;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/18 星期三 3:01
 * @Description:
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
public class UserServiceProxy implements UserService{

    private UserServiceImpl userServiceImpl;

    @Override
    public void add() {
        log("add");
        userServiceImpl.add();
    }

    @Override
    public void delete() {
        log("delete");
        userServiceImpl.delete();
    }

    @Override
    public void update() {
        log("update");
        userServiceImpl.update();
    }

    @Override
    public void query() {
        log("query");
        userServiceImpl.query();
    }

    public void log(String msg) {
        System.out.println(msg);
    }
}
