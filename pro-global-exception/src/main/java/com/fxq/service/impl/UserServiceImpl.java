package com.fxq.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fxq.exception.common.PageResp;
import com.fxq.exception.common.exception.CommonError;
import com.fxq.entity.User;
import com.fxq.entity.dto.user.UserAddReq;
import com.fxq.entity.dto.user.UserPageQueryReq;
import com.fxq.entity.dto.user.UserPageQueryResp;
import com.fxq.entity.dto.user.UserResp;
import com.fxq.mapper.UserMapper;
import com.fxq.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fangxiaoqiang
 * @since 2021-02-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public UserResp getUserById(String id) {
        User user = this.getBaseMapper().selectById(id);
        if(user == null){
            throw CommonError.USER_NOT_FOUND.toException();
        }
        UserResp resp = new UserResp();
        BeanUtil.copyProperties(user,resp);
        return resp;
    }

    @Override
    public void add(UserAddReq req) {
        User user = new User();
        BeanUtil.copyProperties(req,user);
        this.getBaseMapper().insert(user);
    }

    @Override
    public PageResp<UserPageQueryResp> queryPage(UserPageQueryReq req) {
        Page page = req.toPage();
        Page<UserPageQueryResp> userPageQueryRespPage = this.baseMapper.queryPage(page, req);
        PageResp<UserPageQueryResp> resp = PageResp.from(userPageQueryRespPage);
        return resp;
    }
}
