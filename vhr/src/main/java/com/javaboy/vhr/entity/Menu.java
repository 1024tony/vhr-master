package com.javaboy.vhr.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * (Menu)实体类
 *
 * @author gaoyang
 * @since 2020-11-28 15:48:38
 */
@Getter
@Setter
public class Menu implements Serializable {
    private static final long serialVersionUID = -74884549012630901L;

    private Integer id;
    /**
     * 权限控制使用
     */
    private String url;
    /**
     * 前端请求路径
     */
    private String path;
    /**
     * 组件名
     */
    private String component;
    /**
     * 组件名称
     */
    private String name;
    /**
     * 菜单图标
     */
    private String iconCls;
    /**
     * 是否保活：前端是否在内存中销毁
     */
    private Boolean keepAlive;
    /**
     * 是否需要认证
     */
    private Boolean requireAuth;
    /**
     * 父级id
     */
    private Integer parentId;
    /**
     * 是否启用
     */
    private Boolean enabled;

    private List<Menu> children;

    private List<Role> roles;

}