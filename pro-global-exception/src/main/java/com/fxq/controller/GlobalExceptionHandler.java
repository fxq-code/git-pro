package com.fxq.controller;

import com.fxq.exception.common.CommonResult;
import com.fxq.exception.common.exception.CustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;

//@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public CommonResult handlerException(Exception e,HandlerMethod method){
        log.error("{}的{}方法出现了异常！！异常信息：【{}】",method.getBeanType().getName(),method.getMethod().getName(),e.getMessage());
        if(e instanceof CustomException){
            CustomException exception = (CustomException) e;
            return CommonResult.fail(exception.getCode(),exception.getMessage());
        }else{
            return CommonResult.fail(-1,"系统异常");
        }
    }
}
