package com.itheima.dao;

import com.itheima.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface OrderDao {
    @Select("select * from `order` where order_name = #{orderName}")
    public Order getOrderById(String orderName);
}
