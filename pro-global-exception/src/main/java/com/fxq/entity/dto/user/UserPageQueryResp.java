package com.fxq.entity.dto.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fxq.entity.dto.car.CarResp;

import java.util.List;
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})//会导致jackson序列化出错
public class UserPageQueryResp {

    private String id;

    private String name;

    private Integer age;

    private String gender;

    private String about;

    private String address;

    private List<CarResp> cars;
}
