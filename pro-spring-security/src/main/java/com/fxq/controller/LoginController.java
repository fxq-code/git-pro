package com.fxq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class LoginController {

    @RequestMapping("/login")
    public String toLogin(){
        return "login.html";
    }

    @RequestMapping("/")
    public String toHome(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        log.info("当前登录用户：{}",authentication.getName());
        return "home.html";
    }

    @RequestMapping("/admin")
    @ResponseBody
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public String printAdmin(){
        return "admin";
    }

    @RequestMapping("/user")
    @ResponseBody
    @PreAuthorize("hasAnyRole('ROLE_USER')")
    public String printUser(){
        return "user";
    }
}
