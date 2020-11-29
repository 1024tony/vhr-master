package com.javaboy.vhr.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author gaoyang
 * @since 2020-10-31 14:53:01
 */
@Getter
@Setter
public class Role implements Serializable {
    private static final long serialVersionUID = -31851479187797041L;

    private Integer id;

    private String name;
    /**
     * 角色名称
     */
    private String namezh;

}