package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.MenuMapper;
import org.javaboy.vhr.model.Hr;
import org.javaboy.vhr.model.Menu;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: gaoyang
 * @Date: 2020/6/30  9:17
 * @Description:
 */
@Service
public class MenuService {

    @Resource
    MenuMapper menuMapper;

    public List<Menu> getMenusByHrId() {
        // 登录信息保存在SecurityContextHolder
        Integer hrId = ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId();
        return this.menuMapper.getMenusByHrId(hrId);
    }
}
