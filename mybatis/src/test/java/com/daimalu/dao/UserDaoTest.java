package com.daimalu.dao;

import com.daimalu.pojo.User;
import com.daimalu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    //第一步：获得sqlSession对象
    SqlSession sqlSession;
    @Test
    public void test(){
        try {

            sqlSession = MybatisUtils.getSqlSession();
            //方式一：getMapper
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            //关闭sqlSession
            sqlSession.close();
        }

    }

}
