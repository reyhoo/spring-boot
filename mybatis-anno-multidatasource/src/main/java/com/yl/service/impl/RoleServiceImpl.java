package com.yl.service.impl;

import com.yl.mapper.test1.Role1Mapper;
import com.yl.mapper.test2.Role2Mapper;
import com.yl.pojo.Role;
import com.yl.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private Role2Mapper role2Mapper;


    @Override
    @Transactional
    public Role getRole(Long id) {
        return role2Mapper.selectOne(id);
    }
}
