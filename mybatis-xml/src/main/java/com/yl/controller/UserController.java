package com.yl.controller;

import com.yl.pojo.User;
import com.yl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("getUser")
    public User getUser(Long id){
        return userService.getUser(id);
    }

    @RequestMapping("getAll")
    public List<User> getAll(){
        return userService.getAll();
    }
}
