package com.javaboy.vhr.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * (HrRole)实体类
 *
 * @author gaoyang
 * @since 2020-10-31 14:52:33
 */
@Getter
@Setter
public class HrRole implements Serializable {
    private static final long serialVersionUID = 885758579878896000L;

    private Integer id;

    private Integer hrid;

    private Integer rid;

}