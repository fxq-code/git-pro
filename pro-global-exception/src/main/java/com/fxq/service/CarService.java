package com.fxq.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fxq.entity.Car;
import com.fxq.entity.dto.car.CarAddReq;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fangxiaoqiang
 * @since 2021-03-03
 */
public interface CarService extends IService<Car> {

    void add(CarAddReq req);
}
