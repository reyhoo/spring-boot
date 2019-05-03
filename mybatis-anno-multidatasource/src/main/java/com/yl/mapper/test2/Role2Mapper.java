package com.yl.mapper.test2;

import com.yl.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Role2Mapper {


    @Select("select * from t_role where id = #{id}")
    @Results({@Result(id=true,column = "id",property = "id"),@Result(column = "role_name",property = "roleName")
            ,@Result(column = "note",property = "note")})
    Role selectOne(@Param("id") Long id);

    @Select("select * from t_role")
    @Results({@Result(id=true,column = "id",property = "id"),@Result(column = "role_name",property = "roleName")
            ,@Result(column = "note",property = "note")})
    List<Role> selectAll();
}
