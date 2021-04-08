package com.fxq.service;

import java.util.List;

public interface UserRoleService {

    List<Integer> getRoleIdsByUserId(Integer userId);
}
