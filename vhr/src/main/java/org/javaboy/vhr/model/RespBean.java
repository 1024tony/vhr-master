package org.javaboy.vhr.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: gaoyang
 * @Date: 2020/4/28  23:21
 * @Description: 自定义返回结果
 */
@Getter
@Setter
public class RespBean {

    private Integer status;
    private String msg;
    private Object obj;

    public static RespBean ok(String msg){
        return new RespBean(200,msg,null);
    }

    public static RespBean ok(String msg,Object obj){
        return new RespBean(200,msg,obj);
    }

    public static RespBean error(String msg){
        return new RespBean(500,msg,null);
    }

    public static RespBean error(String msg,Object obj){
        return new RespBean(500,msg,obj);
    }

    private RespBean() {
    }

    private RespBean(Integer status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }
}
