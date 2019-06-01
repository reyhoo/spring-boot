package com.yl.mq.dao;

import com.yl.mq.pojo.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    @Select(value = "select * from t_user")
    @Results(value = {@Result(id = true,column = "id",property = "id"),@Result(column = "user_name",property = "userName")})
    List<User>getAll();
}
