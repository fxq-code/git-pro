package com.fxq.service;

import com.fxq.entity.User;

public interface UserService {

    User getById(Integer id);

    User getByUsername(String username);
}
