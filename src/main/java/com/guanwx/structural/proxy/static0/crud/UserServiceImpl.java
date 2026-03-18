package com.guanwx.structural.proxy.static0.crud;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/18 星期三 2:57
 * @Description:
 * @Version: 1.0
 */

public class UserServiceImpl implements UserService{

    @Override
    public void add() {
        System.out.println("添加");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("修改");
    }

    @Override
    public void query() {
        System.out.println("查询");
    }
}
