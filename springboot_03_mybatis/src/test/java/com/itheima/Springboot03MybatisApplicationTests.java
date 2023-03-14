package com.itheima;

import com.itheima.dao.OrderDao;
import com.itheima.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot03MybatisApplication.class)
class Springboot03MybatisApplicationTests {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
        System.out.println(orderDao.getOrderById("AA"));
        System.out.println(userDao.getUserById(1));
    }

}
