package com.demo.test;

import com.colter.demo.entity.User;
import com.colter.demo.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;
import java.util.List;

/**
 * @author liangchao
 * created on 4/7/2019 2:56 PM
 * desc:
 */
@RunWith(JUnit4.class)
public class MyBatisTest {

    @Test
    public void testParse() throws IOException {
        SqlSessionFactory factory =
                new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("testMybatis.xml"));
        SqlSession session = factory.openSession();
        List<User> users = session.selectList("getUserById",1);
        System.out.println(users);
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }
}
