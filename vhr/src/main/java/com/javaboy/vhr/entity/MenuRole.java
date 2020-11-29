package com.javaboy.vhr.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * (MenuRole)实体类
 *
 * @author gaoyang
 * @since 2020-10-31 14:52:49
 */
@Getter
@Setter
public class MenuRole implements Serializable {
    private static final long serialVersionUID = 333364317748227452L;

    private Integer id;

    private Integer mid;

    private Integer rid;

}