package com.yl.mapper.test1;

import com.yl.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Role1Mapper {


    Role selectOne(@Param("id") Long id);


    List<Role> selectAll();
}
