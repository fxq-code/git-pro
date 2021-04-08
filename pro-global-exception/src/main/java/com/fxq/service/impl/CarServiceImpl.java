package com.fxq.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fxq.entity.Car;
import com.fxq.entity.dto.car.CarAddReq;
import com.fxq.mapper.CarMapper;
import com.fxq.service.CarService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fangxiaoqiang
 * @since 2021-03-03
 */
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {

    @Override
    public void add(CarAddReq req) {
        Car car = new Car();
        BeanUtil.copyProperties(req,car);
        this.getBaseMapper().insert(car);
    }
}
