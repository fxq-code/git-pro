package com.fxq.exception.common;

import lombok.Data;

@Data
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    public CommonResult(){}

    public CommonResult(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public static CommonResult success(){
        return new CommonResult(0,"成功");
    }

    public static CommonResult success(Object o){
        CommonResult result = new CommonResult(0,"成功");
        result.setData(o);
        return result;
    }

    public static CommonResult fail(){
        return new CommonResult(-1,"失败");
    }

    public static CommonResult fail(Object o){
        CommonResult result = new CommonResult(-1,"失败");
        result.setData(o);
        return result;
    }

    public static CommonResult fail(Integer code,String message){
        return new CommonResult(code,message);
    }
}
