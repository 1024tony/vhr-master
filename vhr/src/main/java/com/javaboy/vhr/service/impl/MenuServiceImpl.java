package com.javaboy.vhr.service.impl;

import com.javaboy.vhr.dao.MenuDao;
import com.javaboy.vhr.entity.Hr;
import com.javaboy.vhr.entity.Menu;
import com.javaboy.vhr.service.MenuService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Menu)表服务实现类
 *
 * @author gaoyang
 * @since 2020-10-31 14:52:42
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuDao menuDao;

    @Override
    public List<Menu> getMenusByHrId() {
        Hr hr = (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return this.menuDao.getMenusByHrId(hr.getId());
    }

}