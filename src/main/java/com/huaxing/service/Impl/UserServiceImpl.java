package com.huaxing.service.Impl;

import com.huaxing.entity.TbUser;
import com.huaxing.mapper.UserMapper;
import com.huaxing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<TbUser> findUserList(TbUser user) {
        return userMapper.findUserList(user);
    }

    @Override
    public void insertUser(TbUser user) {
        userMapper.insertUser(user);
    }
}
