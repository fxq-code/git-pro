package com.fxq.security;

import com.fxq.entity.Role;
import com.fxq.entity.User;
import com.fxq.service.RoleService;
import com.fxq.service.UserRoleService;
import com.fxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Autowired
    UserRoleService userRoleService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        List<GrantedAuthority> authorities = new ArrayList<>();
        //查询用户信息
        User user = userService.getByUsername(s);
        if(user == null){
            throw new RuntimeException("用户"+s+"不存在");
        }
        //查询用户对应的角色id
        List<Integer> roleIds = userRoleService.getRoleIdsByUserId(user.getId());
        //查询角色
        for (Integer roleId : roleIds) {
            Role role = roleService.getById(roleId);
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),authorities);
    }
}
