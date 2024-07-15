package com.w3u.javalang.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {

    private final Map<String, Object> beans = new HashMap<>();

    public Object getBean(String name) {
        return beans.get(name);
    }

    public void registerBean(String name, Object bean) {
        beans.put(name, bean);
    }

}
