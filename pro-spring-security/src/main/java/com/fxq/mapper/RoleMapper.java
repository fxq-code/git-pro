package com.fxq.mapper;

import com.fxq.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RoleMapper {
    Role getById(@Param("id") Integer id);
}
