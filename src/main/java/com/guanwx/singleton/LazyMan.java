package com.guanwx.singleton;

/**
 * @Author: guanwx
 * @CreateTime: 2026/2/12 星期四 2:07
 * @Description: 懒汉式单例模式
 * @Version: 1.0
 */

public class LazyMan {

    // volatile + DCL双重锁
    private volatile static LazyMan lazyMan;

    private LazyMan() {}

    // DCL双重锁保证安全
    private static LazyMan getLazyMan(){
        if (lazyMan == null){
            synchronized (LazyMan.class){
                if (lazyMan == null)
                    lazyMan = new LazyMan();
            }
        }
        return lazyMan;
    }

}

// todo 枚举自带单例模式 enum

