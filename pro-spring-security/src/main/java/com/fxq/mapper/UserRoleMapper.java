package com.fxq.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserRoleMapper {

    List<Integer> getRoleIdsByUserId(@Param("userId") Integer userId);
}
