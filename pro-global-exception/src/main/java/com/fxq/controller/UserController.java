package com.fxq.controller;


import com.fxq.exception.annotation.Log;
import com.fxq.exception.common.CommonResult;
import com.fxq.exception.common.PageResp;
import com.fxq.entity.dto.user.UserAddReq;
import com.fxq.entity.dto.user.UserPageQueryReq;
import com.fxq.entity.dto.user.UserPageQueryResp;
import com.fxq.entity.dto.user.UserResp;
import com.fxq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fangxiaoqiang
 * @since 2021-02-24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public CommonResult getUserById(@PathVariable("id") String id){
        UserResp resp = userService.getUserById(id);
        return CommonResult.success(resp);
    }

    @PostMapping("/add")
    @Log
    public CommonResult add(@RequestBody UserAddReq req){
        userService.add(req);
        return CommonResult.success();
    }

    @PostMapping("/query/page")
    public PageResp queryPage(@RequestBody UserPageQueryReq req){
        PageResp<UserPageQueryResp> resp = userService.queryPage(req);
        return resp;
//        return CommonResult.success(resp);
    }



}
