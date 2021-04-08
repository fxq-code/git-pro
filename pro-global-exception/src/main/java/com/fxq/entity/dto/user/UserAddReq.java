package com.fxq.entity.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddReq {

    private String name;

    private Integer age;

    private String gender;

    private String about;

    private String address;

    private BigDecimal price;
}
