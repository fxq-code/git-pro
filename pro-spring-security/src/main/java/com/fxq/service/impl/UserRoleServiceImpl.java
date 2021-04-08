package com.fxq.service.impl;

import com.fxq.mapper.UserRoleMapper;
import com.fxq.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    UserRoleMapper userRoleMapper;

    @Override
    public List<Integer> getRoleIdsByUserId(Integer userId) {
        return userRoleMapper.getRoleIdsByUserId(userId);
    }
}
