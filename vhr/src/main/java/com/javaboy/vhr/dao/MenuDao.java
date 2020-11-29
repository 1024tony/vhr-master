package com.javaboy.vhr.dao;

import com.javaboy.vhr.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Menu)表数据库访问层
 *
 * @author gaoyang
 * @since 2020-10-31 16:26:24
 */
public interface MenuDao {
    List<Menu> getMenusByHrId(Integer hrId);
}