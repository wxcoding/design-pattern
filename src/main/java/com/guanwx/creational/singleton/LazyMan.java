package com.guanwx.creational.singleton;

/**
 * @Author: guanwx
 * @CreateTime: 2026/2/12 星期四 2:07
 * @Description: 懒汉式单例模式
 * @Version: 1.0
 */

public class LazyMan {

    // volatile(保证原子性) + DCL双重锁
    private volatile static LazyMan lazyMan;

    private LazyMan() {}

    // DCL双重锁保证安全
    private static LazyMan getInstance(){
        if (lazyMan == null){
            synchronized (LazyMan.class){
                if (lazyMan == null)
                    lazyMan = new LazyMan(); // 分配内存空间 -> 执行构造方法，初始化对象 -> 把这个对象指向这个空间
            }
        }
        return lazyMan;
    }

}

// todo 枚举自带单例模式 enum（反射不能破坏枚举自带单例模式）

