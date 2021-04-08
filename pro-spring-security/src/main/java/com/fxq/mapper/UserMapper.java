package com.fxq.mapper;

import com.fxq.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User getById(@Param("id") Integer id);

    User getByUsername(@Param("username") String username);
}
