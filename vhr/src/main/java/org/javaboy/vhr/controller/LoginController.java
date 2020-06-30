package org.javaboy.vhr.controller;

import org.javaboy.vhr.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gaoyang
 * @Date: 2020/5/6  15:26
 * @Description:
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    //@CrossOrigin("*")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录");
    }

}
