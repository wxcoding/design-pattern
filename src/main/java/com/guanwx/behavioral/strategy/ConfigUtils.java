package com.guanwx.behavioral.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: guanwx
 * @CreateTime: 2026/3/22 星期日 3:30
 * @Description:
 * @Version: 1.0
 */

public class ConfigUtils {

    private static final Map<String, Object> map = new ConcurrentHashMap<>();

    static {
        map.put("msgSender", new MsgSender());
        map.put("mailSender",new MailSender());
    }

    public static <T> T getBean(String name, Class<T> tClass) {
        Object o = map.get(name + "Sender");
        if (o == null) {
            throw new RuntimeException("输入有误");
        }
        return (T) o;
    }

}
