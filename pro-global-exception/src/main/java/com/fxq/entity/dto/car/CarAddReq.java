package com.fxq.entity.dto.car;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CarAddReq {

    private String userId;

    private String brand;

    private BigDecimal price;

    private String detail;
}
