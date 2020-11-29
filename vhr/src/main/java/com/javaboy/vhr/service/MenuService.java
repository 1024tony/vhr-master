package com.javaboy.vhr.service;

import com.javaboy.vhr.entity.Menu;

import java.util.List;

/**
 * (Menu)表服务接口
 *
 * @author gaoyang
 * @since 2020-10-31 14:52:42
 */
public interface MenuService {

    List<Menu> getMenusByHrId();

}