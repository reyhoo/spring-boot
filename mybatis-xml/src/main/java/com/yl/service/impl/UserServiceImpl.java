package com.yl.service.impl;

import com.yl.dao.UserMapper;
import com.yl.pojo.User;
import com.yl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        return userMapper.selectOne(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }
}
