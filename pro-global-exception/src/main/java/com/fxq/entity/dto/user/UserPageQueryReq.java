package com.fxq.entity.dto.user;

import com.fxq.exception.common.PageReq;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPageQueryReq extends PageReq {

    private String name;
}
