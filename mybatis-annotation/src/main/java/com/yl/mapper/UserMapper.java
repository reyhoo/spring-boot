package com.yl.mapper;

import com.yl.pojo.User;
import com.yl.typehandler.SexEnumTypeHandler;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {


    @Select("select * from ec_user where id=#{id}")
    @Results({@Result(id = true,column = "id",property = "id"),@Result(column = "username",property = "username")
            ,@Result(column = "sex",property = "sex",typeHandler = SexEnumTypeHandler.class)})
    User selectOne(@Param("id") Long id);


    @Select("select * from ec_user")
    @Results({@Result(id = true,column = "id",property = "id"),@Result(column = "username",property = "username")
            ,@Result(column = "sex",property = "sex",typeHandler = SexEnumTypeHandler.class)})
    List<User> selectAll();
}
