package com.fxq.exception.aspect;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogAspect {

//    @Pointcut("execution(* com.fxq.controller.UserController.*(..)) || @annotation(com.fxq.exception.annotation.Log)")
    @Pointcut("@annotation(com.fxq.exception.annotation.Log)")
    public void pointCut(){}

    @Around("pointCut()")
    public Object log(ProceedingJoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        Object resp = null;
        log.info("【{}】请求参数：【{}】",joinPoint.getSignature().toShortString(),JSONUtil.toJsonStr(args));
        try {
            resp = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }finally {
            log.info("【{}】返回参数：【{}】",joinPoint.getSignature().toShortString(),JSONUtil.toJsonStr(resp));
        }
        return resp;
    }

}
