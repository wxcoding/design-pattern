package com.guanwx.creational.prototype;

import lombok.Data;

import java.util.Date;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/15 星期日 21:02
 * @Description: 原型模式
 * @Version: 1.0
 */

@Data
public class CloneObject implements Cloneable {

    private String name;
    private Date dateTime;

    @Override
    public CloneObject clone() {
        try {
            CloneObject clone = (CloneObject) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public CloneObject(String name, Date dateTime) {
        this.name = name;
        this.dateTime = dateTime;
    }

}
