package com.yl.service;

import com.yl.pojo.User;

import java.util.List;

public  interface UserService {



    User getUser(Long id);

    List<User>getAll();
}
