package org.javaboy.vhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: gaoyang
 * @Date: 2020/4/28  22:18
 * @Description: Hr接口
 */
@RestController
public class HrController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "你好";
    }

}
