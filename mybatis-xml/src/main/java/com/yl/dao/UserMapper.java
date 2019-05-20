package com.yl.dao;

import com.yl.pojo.User;
import com.yl.typehandler.SexEnumTypeHandler;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {



    User selectOne(@Param("id") Long id);


//
//    @Select("select * from ec_user")
//    @Results({@Result(id = true,column = "id",property = "id")
//    ,@Result(id = false,column = "username",property = "username"),
//            @Result(id = false,column = "sex",property = "sex",typeHandler = SexEnumTypeHandler.class)})
    List<User> selectAll();
}
