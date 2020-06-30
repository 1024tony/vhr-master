package org.javaboy.vhr.model;

import lombok.Data;

import java.util.Date;

/**
 * @Author: gaoyang
 * @Date: 2020/6/8  14:39
 * @Description:
 */
@Data
public class ChatMsg {

    private String from;
    private String to;
    private String content;
    private Date date;
    private String fromNickname;

}
