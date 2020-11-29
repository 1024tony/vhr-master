package com.javaboy.vhr.controller;

import com.javaboy.vhr.entity.Menu;
import com.javaboy.vhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: gaoyang
 * @Date: 2020/10/31  15:10
 * @Description:
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {

    @Autowired
    MenuService menuService;

    /**
     * 根据登录的 hrId 查询权限菜单
     * 前端参数不可信，hr_id 由后端获取
     * @return
     */
    @RequestMapping("/menu")
    public List<Menu> getMenusByHrId(){
        return menuService.getMenusByHrId();
    }

}
