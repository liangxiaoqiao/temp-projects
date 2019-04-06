package com.colter.demo.service;

import com.colter.demo.entity.User;
import com.colter.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liangchao
 * created on 2019/4/6 22:18
 * desc:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
//
//    @Override
//    public void addUser(User user) {
//        userMapper.addUser(user);
//    }
//
//    @Override
//    public void deleteUser(int id) {
//        userMapper.deleteUser(id);
//    }
//
//    @Override
//    public void updateUser(User user) {
//        userMapper.updateUser(user);
//    }
}
