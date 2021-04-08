package com.fxq.entity.dto.car;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})//会导致jackson序列化出错
public class CarResp {

    private String id;

    private String brand;

    private BigDecimal price;

    private String detail;
}
