package com.yl.controller;

import com.yl.mapper.test1.Role1Mapper;
import com.yl.mapper.test2.Role2Mapper;
import com.yl.pojo.Role;
import com.yl.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {


    @Autowired
    private Role1Mapper role1Mapper;

    @Autowired
    private Role2Mapper role2Mapper;


    @Autowired
    private RoleService roleService;

    /**
     * 测试自定义数据源的事务管理器是否生效。结果是可以生效。
     * @param id
     * @return
     */
    @RequestMapping("getRole")
    public Role getRole(Long id){
        return roleService.getRole(id);
    }

    @RequestMapping("getRole1")
    public Role getRole1(Long id){
        return role1Mapper.selectOne(id);
    }

    @RequestMapping("getRole2")
    public Role getRole2(Long id){
        return role2Mapper.selectOne(id);
    }
}
