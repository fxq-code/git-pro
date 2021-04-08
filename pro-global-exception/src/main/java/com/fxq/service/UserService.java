package com.fxq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fxq.exception.common.PageResp;
import com.fxq.entity.User;
import com.fxq.entity.dto.user.UserAddReq;
import com.fxq.entity.dto.user.UserPageQueryReq;
import com.fxq.entity.dto.user.UserPageQueryResp;
import com.fxq.entity.dto.user.UserResp;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fangxiaoqiang
 * @since 2021-02-24
 */
public interface UserService extends IService<User> {

    UserResp getUserById(String id);

    void add(UserAddReq req);

    PageResp<UserPageQueryResp> queryPage(UserPageQueryReq req);
}
