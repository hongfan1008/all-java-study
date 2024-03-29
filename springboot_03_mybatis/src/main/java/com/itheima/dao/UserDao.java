package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.awt.print.Book;

@Mapper
public interface UserDao {
    @Select("select * from user where id = #{id}")
    public User getUserById(Integer id);

}
