package com.guanwx.creational.prototype;

import java.util.Date;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/15 星期日 22:26
 * @Description:
 * @Version: 1.0
 */

public class PrototypeMain {
    public static void main(String[] args) {

        CloneObject cloneObject = new CloneObject("原型", new Date());
        CloneObject clone = cloneObject.clone();

        System.out.println(cloneObject.hashCode() + " = > " + cloneObject);
        System.out.println(clone.hashCode() + " = > " + clone);
    }

}
