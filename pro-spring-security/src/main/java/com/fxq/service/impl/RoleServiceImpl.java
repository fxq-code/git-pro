package com.fxq.service.impl;

import com.fxq.entity.Role;
import com.fxq.mapper.RoleMapper;
import com.fxq.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;
    @Override
    public Role getById(Integer id) {
        return roleMapper.getById(id);
    }
}
