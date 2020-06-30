package org.javaboy.vhr.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author: gaoyang
 * @Date: 2020/5/17  21:47
 * @Description: 分页查询结果
 */
@Getter
@Setter
public class RespPageBean {

    private Long total;
    private List<?> data;

}
