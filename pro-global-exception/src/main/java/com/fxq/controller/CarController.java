package com.fxq.controller;


import com.fxq.exception.common.CommonResult;
import com.fxq.entity.dto.car.CarAddReq;
import com.fxq.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fangxiaoqiang
 * @since 2021-03-03
 */
@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("/add")
    public CommonResult add( @RequestBody CarAddReq req){
        carService.add(req);
        return CommonResult.success();
    }
}
