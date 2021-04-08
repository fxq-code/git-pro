package com.fxq.exception.common;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class PageReq {

    @Min(value = 1L,message = "当前页码不能小于1")
    private Integer current;

    @Min(value = 1L,message = "页面大小不能小于1")
    @Max(value = 50,message = "页面大小不能大于50")
    private Integer size;

    public PageReq(Integer current,Integer size){
        this.current = current;
        this.size = size;
    }
    public PageReq(){}

    public Page toPage(){
        return new Page(current,size);
    }
}
