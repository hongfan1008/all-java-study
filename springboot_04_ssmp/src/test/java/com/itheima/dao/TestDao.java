package com.itheima.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;

@SpringBootTest
public class TestDao {
    @Autowired
    private BookDao bookDao;
    @Test
    public void fdf(){
        System.out.println(bookDao.getBookById(1));
        System.out.println(bookDao.selectById(2));
    }
}
