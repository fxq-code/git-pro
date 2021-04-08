package com.fxq.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class ReqController {

    @RequestMapping("/")
    public String toIndex(){
        log.info("请求进来了。。。");
        return "index.html";
    }
}
