package com.yl.mapper;

import com.yl.pojo.User;
import com.yl.typehandler.SexEnumTypeHandler;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {



    User selectOne(@Param("id") Long id);



    List<User> selectAll();
}
