package com.javaboy.vhr.controller;

import com.javaboy.vhr.utils.RespBean;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gaoyang
 * @Date: 2020/10/24  15:05
 * @Description:
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public RespBean hello(){
        return RespBean.error("尚未登录，请登录");
    }

}
