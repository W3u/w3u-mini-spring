package com.w3u.javalang.springframework.beans.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BeanFactoryTest {

    @Test
    void testBeanFactory() {

        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("userService", new UserService());
        UserService userService = (UserService) beanFactory.getBean("userService");
        assertNotNull(userService);
        assertEquals("小马哥", userService.queryUserName(3));
    }

    public static class UserService {
        public String queryUserName(int id) {
            String[] names = {"小马哥", "白起", "周瑜"};
            return names[id % 3];
        }
    }

}