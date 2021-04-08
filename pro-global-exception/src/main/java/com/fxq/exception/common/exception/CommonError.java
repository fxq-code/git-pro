package com.fxq.exception.common.exception;

public enum CommonError {

    USER_NOT_FOUND(1000,"用户不存在");

    private Integer code;

    private String message;

    CommonError(Integer code,String message){
        this.code = code;
        this.message = message;
    }
    public Integer getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }

    public CustomException toException(){
        return new CustomException(this.code,this.message);
    }
}
