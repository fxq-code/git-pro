package com.fxq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fxq.entity.User;
import com.fxq.entity.dto.user.UserPageQueryReq;
import com.fxq.entity.dto.user.UserPageQueryResp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fangxiaoqiang
 * @since 2021-02-24
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    Page<UserPageQueryResp> queryPage(Page page, @Param("req") UserPageQueryReq req);
}
