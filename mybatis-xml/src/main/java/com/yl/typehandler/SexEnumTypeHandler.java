package com.yl.typehandler;

import com.yl.pojo.SexEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import org.springframework.web.bind.annotation.Mapping;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedJdbcTypes(JdbcType.INTEGER)
@MappedTypes(SexEnum.class)
public class SexEnumTypeHandler implements TypeHandler<SexEnum> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, SexEnum sexEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,sexEnum.getId());
    }

    @Override
    public SexEnum getResult(ResultSet resultSet, String s) throws SQLException {
        return SexEnum.getSexById(resultSet.getInt(s));
    }

    @Override
    public SexEnum getResult(ResultSet resultSet, int i) throws SQLException {
        return SexEnum.getSexById(resultSet.getInt(i));
    }

    @Override
    public SexEnum getResult(CallableStatement callableStatement, int i) throws SQLException {
        return SexEnum.getSexById(callableStatement.getInt(i));
    }
}
